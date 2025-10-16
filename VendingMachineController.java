// Controller: Керує взаємодією між користувачем та моделлю
public class VendingMachineController {
    private VendingMachine machine;
    private double currentBalance;

    public VendingMachineController(VendingMachine machine) {
        this.machine = machine;
        this.currentBalance = 0.0;
    }

    public void insertMoney(double amount) {
        currentBalance += amount;
        System.out.println("Баланс: " + currentBalance + " грн");
    }

    public void selectProduct(int slotNumber) {
        if (slotNumber > 0) {
            // Логіка перевірки балансу та видачі товару
            System.out.println("Ви обрали товар номер " + slotNumber);
            // ... тут буде логіка покупки
        }
    }

    public void run() {
        // Імітація роботи
        machine.displayProducts();
        insertMoney(50.0);
        selectProduct(1);
    }
}