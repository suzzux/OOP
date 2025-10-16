// Клас для їжі, що успадковує Product
public class Food extends Product {
    private int weight; // Вага в грамах

    public Food(String name, double price, int weight) {
        super(name, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String getDescription() {
        return "Їжа: " + getName() + ", Вага: " + weight + "г, Ціна: " + getPrice() + " грн";
    }
}