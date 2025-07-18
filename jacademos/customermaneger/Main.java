public class Main {
    public static void main(String[] args) {
        // CustomerManager sınıfından nesneler oluşturuluyor
        CustomerManager customerManager1 = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();

        // customerManager1, customerManager2 nesnesine referans olur
        customerManager1 = customerManager2;

        // Metotlar çağrılarak işlemler gerçekleştiriliyor
        customerManager1.add();
        customerManager1.remove();
        customerManager1.update();
    }
}
