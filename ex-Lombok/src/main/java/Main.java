public class Main {
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("John", "Doe", 30);

        // Access fields using getters
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());

        // Use toString() method
        System.out.println("Person: " + person);

        // Modify fields using setters
        person.setAge(31);

        // Use constructor with parameters
        Person anotherPerson = new Person("Alice", "Smith", 25);
    }
}
