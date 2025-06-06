// Customer sınıfı, Person'dan türetiliyor
public class Customer extends Person {
    String customerId;

    public Customer(String name, int age, String customerId) {
        super(name, age); // Person constructor'ını çağırır
        this.customerId = customerId;
    }

    // Customer'a özel bilgi gösterme
    @Override
    public void displayInfo() {
        super.displayInfo(); // Person'daki metodu çağır
        System.out.println("Müşteri ID: " + customerId);
    }
}
