import java.util.ArrayList;
import java.util.List;

// Реалізація VendingMachine як Singleton
public class VendingMachineSingleton {

    private static VendingMachineSingleton instance;
    private List<Slot> slots;

    // Приватний конструктор
    private VendingMachineSingleton() {
        slots = new ArrayList<>();
    }

    // Метод для отримання єдиного екземпляра
    public static synchronized VendingMachineSingleton getInstance() {
        if (instance == null) {
            instance = new VendingMachineSingleton();
        }
        return instance;
    }

    public void addSlot(Slot slot) {
        slots.add(slot);
    }

    public void displayProducts() {
        System.out.println("--- Асортимент ---");
        for (int i = 0; i < slots.size(); i++) {
            Slot slot = slots.get(i);
            System.out.println((i + 1) + ". " + slot.getProduct().getDescription() + " | Залишилось: " + slot.getQuantity());
        }
        System.out.println("-----------------");
    }
    // ... інші методи
}