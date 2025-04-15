// ProductManager.java
// Bu sınıf, ürünleri yönetmek için gerekli işlemleri içerir.

public class ProductManager {

    // Ürünün fiyatını güncelleyen metot
    public void updatePrice(Product product, double newPrice) {
        product.setPrice(newPrice);
        System.out.println("Yeni fiyat güncellendi: " + product.getPrice() + " TL");
    }

    // Ürünün stok miktarını güncelleyen metot
    public void updateStock(Product product, int newStock) {
        product.setStock(newStock);
        System.out.println("Yeni stok miktarı güncellendi: " + product.getStock() + " adet");
    }

    // Ürün bilgilerini görüntüleyen metot
    public void printProductDetails(Product product) {
        System.out.println("=== Ürün Detayları ===");
        product.displayProduct();
    }
}
