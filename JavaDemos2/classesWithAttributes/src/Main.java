public class Main {
    public static void main(String[] args) {
    Product product = new Product();
    product.setName("Laptop");
    product.setId(5);
    product.setPrice(5000);
    product.setStockAmount(3);
    product.setDesctription("Lenovo Laptop");

    System.out.println("Ürün eklendi : " + product.getName());

    ProductManager productManager = new ProductManager();
    productManager.Add(product);
    }
}
