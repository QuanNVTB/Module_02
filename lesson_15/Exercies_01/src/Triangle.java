public class Triangle {
    private double a, b, c;
    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if(a <= 0 || b <= 0 || c <= 0){
            throw new IllegalTriangleException("Canh tam gia phai lon hon 0");
        }
        if(a + b <= c || c + b <= a || c + a <= b){
            throw new IllegalTriangleException("Tong hai canh khong lon hon canh con lai.");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String toString() {
        return "Tam gia voi cac canh: a = " + a + ", b = " + b + ", c = " + c;
    }
}
