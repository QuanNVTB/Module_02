//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BinarySearchTree_Recursive tree = new BinarySearchTree_Recursive();
        int[] keys = {27, 14, 35, 10, 19, 31, 42};
        for(int key : keys) {
            tree.insert(key);
        }
        System.out.println("Tim 19: " + tree.search(19));
        System.out.println("Tim 99: " + tree.search(99));
    }
}