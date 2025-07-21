//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       BinarySearchTree tree = new BinarySearchTree();
       int[] keys = {27, 14, 35, 10, 19, 31, 42};
       for (int key : keys) {
           tree.insert(key);
       }
        System.out.println("Cay ban dau(post - order: ");
       tree.postOrder();

       tree.delete(35);
        System.out.println("Sau khi xoa 35(post-order): ");
        tree.postOrder();
    }
}