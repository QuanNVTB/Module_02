import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm theo ID");
            System.out.println("3. Xoá sản phẩm theo ID");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp tăng dần theo giá");
            System.out.println("7. Sắp xếp giảm dần theo giá");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhap ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap gia: ");
                    double price = Double.parseDouble(sc.nextLine());
                    manager.addProduct(new Product(id, name, price));
                    break;
                case 2:
                    System.out.print("Nhap ID san pham can sua: ");
                    int updateId = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap ten moi: ");
                    String newName = sc.nextLine();
                    System.out.print("Nhap gia moi: ");
                    double newPrice = Double.parseDouble(sc.nextLine());
                    if (!manager.updateProduct(updateId, newName, newPrice)) {
                        System.out.println("Khong tim thay san pham voi ID " + updateId);
                    }
                    break;
                case 3:
                    System.out.print("Nhap ID san pham can xoa: ");
                    int removeId = Integer.parseInt(sc.nextLine());
                    if (!manager.removeProduct(removeId)) {
                        System.out.println("Khong tim thay san pham de xoa.");
                    }
                    break;
                case 4:
                    manager.showProducts();
                    break;
                case 5:
                    System.out.print("Nhap tan san pham can tim: ");
                    String keyword = sc.nextLine();
                    manager.searchByName(keyword);
                    break;
                case 6:
                    manager.sortByPriceAscending();
                    System.out.println("Da sap xep tang dan theo gia.");
                    break;
                case 7:
                    manager.sortByPriceDescending();
                    System.out.println("Da sap xep giam dan theo gia.");
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }
}