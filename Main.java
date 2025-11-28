import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Створення екземплярів класу Person
        // Конструктор ініціалізує поля firstName, lastName та birthYear
        Person person1 = new Person("Іван", "Франко", 1856);
        Person person2 = new Person("Леся", "Українка", 1871);
        Person person3 = new Person("Іван", "Франко", 1856);

        // Використання геттерів для отримання даних
        System.out.println("Перевірка особи 1: " + person1.getFirstName() + " " + person1.getLastName());

        // Демонстрація роботи методу equals()
        System.out.println("\n--- Перевірка рівності (equals) ---");
        if (person1.equals(person3)) {
            System.out.println("person1 та person3 рівні (за логікою equals).");
        } else {
            System.out.println("person1 та person3 НЕ рівні.");
        }

        if (!person1.equals(person2)) {
            System.out.println("person1 та person2 різні.");
        }

        // Демонстрація роботи методу hashCode()
        System.out.println("\n--- Перевірка хеш-коду (hashCode) ---");
        System.out.println("HashCode person1: " + person1.hashCode());
        System.out.println("HashCode person3: " + person3.hashCode());

        // Створення колекції HashSet. Вона не дозволяє дублікатів.
        Set<Person> peopleSet = new HashSet<>();
        peopleSet.add(person1);
        peopleSet.add(person2);
        peopleSet.add(person3);

        System.out.println("Кількість унікальних людей у Set: " + peopleSet.size());
        
        for (Person p : peopleSet) {
            System.out.println("- " + p.getFirstName() + " " + p.getLastName());
        }
    }
}
