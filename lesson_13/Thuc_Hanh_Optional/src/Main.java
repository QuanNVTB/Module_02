import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        int[] frequentChar = new int[255];
        for(int i = 0; i < inputString.length(); i++){
            int ascii = (int) inputString.charAt(i);
            frequentChar[ascii] += i;
        }
        int max = 0;
        char character = (char) 255;
        for(int j = 0; j < 255; j++){
            if(frequentChar[j] > max){
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is " + character + " with a frequency of " + max + " times");
    }

}