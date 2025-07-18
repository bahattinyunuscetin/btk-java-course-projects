// Employee da Person sınıfından kalıtım alır
public class Employee extends Person {
    String position;
    double salary;

    public Employee(String name, int age, String position, double salary) {
        super(name, age); // Person constructor'ı
        this.position = position;
        this.salary = salary;
    }

    // Employee'a özel bilgi gösterme
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pozisyon: " + position);
        System.out.println("Maaş: " + salary + " TL");
    }
}
