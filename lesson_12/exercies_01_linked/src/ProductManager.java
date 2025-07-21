import java.util.Comparator;
import java.util.LinkedList;

public class ProductManager {
    private LinkedList<Product> products = new LinkedList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean updateProduct(int id, String newName, double newPrice) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }

    public boolean removeProduct(int id) {
        return products.removeIf(product -> product.getId() == id);
    }

    public void showProducts() {
        if (products.isEmpty()) {
            System.out.println("Danh sach san pham rong.");

        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (Product product : products) {
            if(product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
                found = true;
            }
        }
        if(!found) {
            System.out.println("Khong tim thay san pham nao co ten chua: " + name);
        }
    }

    public void sortByPriceAscending() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void sortByPriceDescending() {
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }
}
