package classesWithAttributes;

public class ProductManager {
    public void Add(Product product) {
        //JDBC
        System.out.println("Product Added " + product.getName());
    }

    public void Add2(int id, String name, String description, int stockAmount, double price, String colour) {

    }
}