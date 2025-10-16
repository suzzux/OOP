// Клас для напоїв, що успадковує Product
public class Drink extends Product {
    private double volume; // Об'єм в літрах

    public Drink(String name, double price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String getDescription() {
        return "Напій: " + getName() + ", Об'єм: " + volume + "л, Ціна: " + getPrice() + " грн";
    }
}