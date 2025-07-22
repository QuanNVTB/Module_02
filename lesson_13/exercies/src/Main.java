import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao day: ");
        String string = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        //Tìm chuỗi tang dần có độ dài lớn nhất
        for(int i = 0; i < string.length(); i++){
            LinkedList<Character> temp = new LinkedList<>();//linkedlist trung gian
            //Thêm ký tự thứ i vào temp
            temp.add(string.charAt(i));
            for(int j = i+1; j < string.length(); j++){
                if(string.charAt(j) > temp.getLast()){
                    temp.add(string.charAt(j));
                }
            }
            if(temp.size() > max.size()){
                max.clear();
                max.addAll(temp);
            }
            temp.clear();
        }
        for(Character c : max){
            System.out.println(c);
        }
        System.out.println();
    }
}