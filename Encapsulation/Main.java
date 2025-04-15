// Main.java
// Programın başlangıç noktasıdır.

public class Main {
    public static void main(String[] args) {
        // Yeni bir ürün oluşturuluyor.
        Product product = new Product("Laptop", 15000, 5);

        // Ürün yöneticisi (ProductManager) nesnesi oluşturuluyor.
        ProductManager productManager = new ProductManager();

        // Ürün bilgileri ekrana yazdırılıyor.
        productManager.printProductDetails(product);

        // Fiyat güncelleniyor.
        productManager.updatePrice(product, 17000);

        // Stok miktarı güncelleniyor.
        productManager.updateStock(product, 10);

        // Güncellenmiş ürün bilgileri tekrar yazdırılıyor.
        System.out.println("\nGüncellenmiş Ürün Bilgileri:");
        productManager.printProductDetails(product);

        // Geçersiz değer atamayı deneyelim.
        productManager.updatePrice(product, -5000); // Hata mesajı verecek
        productManager.updateStock(product, -3);    // Hata mesajı verecek
    }
}
