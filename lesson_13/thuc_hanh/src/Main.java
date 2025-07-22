//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch1 = new BinarySearch();
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int key = 59;
        int index = BinarySearch.binarySearch(list, key);
        if(index != -1){
            System.out.println("Fond " + key + " in the array " + index);
        }else{
            System.out.println("Not found");
        }
    }
}