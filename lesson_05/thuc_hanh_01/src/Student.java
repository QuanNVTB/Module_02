public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n){
        rollno = r;
        name = n;
    }

    static void change(){
        college = "CODEGYM";
    }
    static void change1(){
        college = " Xin chao";
    }

    void display(){
        System.out.println(rollno + " " + name + college);
    }
}
