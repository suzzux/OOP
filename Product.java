// Абстрактний клас для всіх продуктів
public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Абстрактний метод, який буде реалізовано в підкласах
    public abstract String getDescription();
}