import java.io.Serializable;

public class Product  implements Serializable{
    private String idProduct;
    private String nameProduct;
    private double priceProduct;
    private String production;
    private String describe;

    public Product(String idProduct, String nameProduct, double priceProduct, String production, String describe) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.production = production;
        this.describe = describe;
    }

    public String getIdProduct() {
        return idProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", production='" + production + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
