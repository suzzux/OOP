// Factory Method для створення продуктів
public class ProductFactory {
    public enum ProductType {
        DRINK,
        FOOD
    }

    public static Product createProduct(ProductType type, String name, double price, double spec) {
        switch (type) {
            case DRINK:
                return new Drink(name, price, spec); // spec - це об'єм
            case FOOD:
                return new Food(name, price, (int)spec); // spec - це вага
            default:
                throw new IllegalArgumentException("Невідомий тип продукту: " + type);
        }
    }
}