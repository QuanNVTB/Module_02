public class ClassificationOfTriangle {
    public static String triangle(int a, int b, int c) {
        if(a <= 0 || b <= 0 || c <= 0 || a+b <=0 || a + c <= b || b + c <= a) {
            return "Không phải là tam giác";
        }

        if(a == b && b == c){
            return "Tam giác đều";
        }

        if(a == b || b == c || a==c){
            return "Tam giác cân";
        }

        return "Tam giác thường";
    }
}
