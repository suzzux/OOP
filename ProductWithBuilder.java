// Клас Product з реалізацією шаблону Builder
public abstract class ProductWithBuilder {
    // Обов'язкові параметри
    private final String name;
    private final double price;

    // Необов'язкові параметри
    private final int calories;
    private final String expirationDate;

    public static abstract class Builder<T extends Builder<T>> {
        private final String name;
        private final double price;

        private int calories = 0;
        private String expirationDate = "N/A";

        public Builder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public T calories(int val) {
            calories = val;
            return self();
        }

        public T expirationDate(String date) {
            expirationDate = date;
            return self();
        }

        abstract ProductWithBuilder build();

        protected abstract T self();
    }

    protected ProductWithBuilder(Builder<?> builder) {
        name = builder.name;
        price = builder.price;
        calories = builder.calories;
        expirationDate = builder.expirationDate;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getDescription() {
        return "Продукт: " + name + ", Ціна: " + price + ", Калорії: " + calories;
    }
}

// Конкретний напій з білдером
class DrinkWithBuilder extends ProductWithBuilder {
    private final double volume;

    public static class Builder extends ProductWithBuilder.Builder<Builder> {
        private double volume = 0.5;

        public Builder(String name, double price) {
            super(name, price);
        }

        public Builder volume(double val) {
            volume = val;
            return this;
        }

        @Override
        public DrinkWithBuilder build() {
            return new DrinkWithBuilder(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private DrinkWithBuilder(Builder builder) {
        super(builder);
        volume = builder.volume;
    }

    @Override
    public String getDescription() {
        return "Напій: " + getName() + ", Об'єм: " + volume + "л, Ціна: " + getPrice() + " грн";
    }
}