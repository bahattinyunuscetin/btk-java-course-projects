// Product.java
// Bu sınıf bir ürünü temsil eder ve kapsülleme (encapsulation) uygular.

public class Product {
    // Özel (private) değişkenler: Dışarıdan doğrudan erişilemez.
    private String name;
    private double price;
    private int stock;

    // Constructor (Yapıcı Metot): Yeni bir ürün oluştururken başlangıç değerlerini belirler.
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getter ve Setter Metotları (Encapsulation)
    // Getter: Özel değişkenlere güvenli bir şekilde erişmeyi sağlar.

    public String getName() {
        return name;
    }

    // Setter: Özel değişkenlerin değerini güncellemeyi sağlar.
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // Fiyat negatif olamaz, güvenlik kontrolü eklenmiştir.
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Hata: Fiyat negatif olamaz!");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        // Stok negatif olamaz, güvenlik kontrolü eklenmiştir.
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Hata: Stok miktarı negatif olamaz!");
        }
    }

    // Ürün bilgilerini ekrana yazdıran metot
    public void displayProduct() {
        System.out.println("Ürün Adı: " + name);
        System.out.println("Fiyat: " + price + " TL");
        System.out.println("Stok: " + stock + " adet");
    }
}
