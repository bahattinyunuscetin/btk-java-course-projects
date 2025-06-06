// Üst sınıf (base class): Person
public class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Ortak bilgi gösterme metodu
    public void displayInfo() {
        System.out.println("Ad: " + name);
        System.out.println("Yaş: " + age);
    }
}
