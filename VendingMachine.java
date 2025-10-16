import java.util.ArrayList;
import java.util.List;

// Основний клас автомату
public class VendingMachine {
    private List<Slot> slots;

    public VendingMachine() {
        this.slots = new ArrayList<>();
    }

    // Creator: VendingMachine створює та керує об'єктами Slot
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

    public Product dispenseProduct(int slotNumber) {
        if (slotNumber > 0 && slotNumber <= slots.size()) {
            Slot slot = slots.get(slotNumber - 1);
            if (slot.getQuantity() > 0) {
                slot.decreaseQuantity();
                return slot.getProduct();
            }
        }
        return null;
    }

    // Information Expert: VendingMachine має всю інформацію для розрахунку
    public double calculateTotalValue() {
        double total = 0.0;
        for(Slot slot : slots) {
            total += slot.getProduct().getPrice() * slot.getQuantity();
        }
        return total;
    }
}