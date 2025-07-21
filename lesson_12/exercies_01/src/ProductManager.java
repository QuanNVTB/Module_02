import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean updateProduct(int id, String newName, double newPrice) {
        for(Product product : products){
            if(product.getId() == id){
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
        if(products.isEmpty()){
            System.out.println("Danh sach rong.");
        }else {
            for(Product product : products){
                System.out.println(product);
            }
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for(Product product : products){
            if(product.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(product);
                found = true;
            }
        }
        if(!found){
            System.out.println("Khong tim thay san pham co chua ten: " + name);
        }
    }
    public void sortByPriceAscending() {
        products.sort(Comparator.comparing(Product::getPrice));
    }

        public void sortByPriceDescending() {
            products.sort(Comparator.comparing(Product::getPrice).reversed());
        }
}
