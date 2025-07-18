public class Main {
    public static void main(String[] args) {
        // Müşteri nesnesi
        Customer customer1 = new Customer("Ayşe Yılmaz", 30, "C123");
        System.out.println("--- Müşteri Bilgisi ---");
        customer1.displayInfo();

        System.out.println();

        // Çalışan nesnesi
        Employee employee1 = new Employee("Mehmet Demir", 40, "Muhasebe Müdürü", 25000);
        System.out.println("--- Çalışan Bilgisi ---");
        employee1.displayInfo();
    }
}
