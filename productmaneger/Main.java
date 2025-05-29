//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product =new Product();
        product.name="laptop";
        product.id=1;
        product.description="asus laptop";
        product.price=5000;
        product.stockAmount=3;
        ProductManager productManager=new ProductManager();
        productManager.Add(product);
    }
}