import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Nhap chuoi: ");
        String string = sc.nextLine();

        for(int i = 0; i < string.length(); i++){
            if(list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))){
                    list.clear();
                }

            list.add(string.charAt(i));

            if(list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }

        for(Character c : max){
            System.out.println(c);
        }
        System.out.println();
    }
}