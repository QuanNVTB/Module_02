import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    private static final String FILE_NAME = "sanpham.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("\n----- MENU -----");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Hiển thị sản phẩm");
        System.out.println("3. Tìm kiếm sản phẩm theo mã");
        System.out.println("0. Thoát");
        System.out.print("Chọn: ");
        choice = sc.nextInt();
        sc.nextLine(); // bỏ dòng new line

        switch (choice) {
            case 1:
                themSanPham(sc);
                break;
            case 2:
                hienThiSanPham();
                break;
            case 3:
                timKiemSanPham(sc);
                break;
            case 0:
                System.out.println("Thoát chương trình.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");

    } while (choice != 0);
}

    public static void themSanPham(Scanner sc) {
        System.out.print("Nhap mã SP: ");
        String id = sc.nextLine();
        System.out.print("Nhap ten SP: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập hãng Sản Xuất: ");
        String production = sc.nextLine();
        System.out.print("Mô tả: ");
        String describe = sc.nextLine();

        Product product = new Product(id, name, price, production, describe);

        List<Product>  listProduct = readFile();
        listProduct.add(product);
        writeFiles(listProduct);
        System.out.println("Thêm sản phẩm thành công");
    }

    public static void hienThiSanPham() {
        List<Product> listProduct = readFile();
        if(listProduct.isEmpty()){
            System.out.println("Khong co san pham nao");
        }else{
            System.out.println("Danh sach san pham: ");
            for (Product product : listProduct) {
                System.out.println(product);
            }
        }
    }

    private static void timKiemSanPham(Scanner sc) {
        System.out.print("Nhap ma san pham can tim: ");
        String idProduct = sc.nextLine();

        List<Product> listProduct = readFile();
        boolean find = false;

        for (Product product : listProduct) {
            if(product.getIdProduct().equalsIgnoreCase(idProduct)){
                System.out.println("Tim thay: " + product);
                find = true;
                break;
            }
        }
        if(!find){
            System.out.println("Khong tim thay san pham co ma " + idProduct);
        }
    }
    private static List<Product> readFile(){
        File fl = new File(FILE_NAME);
        if(!fl.exists()){
            return new ArrayList<>();
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){
            return (List<Product>) ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Loi doc file: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    private static void writeFiles(List<Product> listProduct) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            oos.writeObject(listProduct);
        } catch (IOException e) {
            System.out.println("Loi ghi file: " + e.getMessage());
        }
    }
}
