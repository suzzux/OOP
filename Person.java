public class Person {

    private final String firstName;
    private final String lastName;
    private final int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Обчислює хеш-код для об'єкта Person. Множення на 31 (просте число)
     * допомагає мінімізувати колізії, створюючи ширший розподіл хеш-кодів.
     * Прості числа використовуються, оскільки вони не мають дільників, крім 1 і самих себе,
     * що допомагає уникнути закономірностей у розподілі хеш-кодів, які можуть призвести до
     * більшої кількості колізій..
     */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + birthYear;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        if (birthYear != person.birthYear) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return lastName != null ? lastName.equals(person.lastName) : person.lastName == null;
    }
}
