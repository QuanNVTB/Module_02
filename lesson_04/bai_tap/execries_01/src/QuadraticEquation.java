public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
         return b * b - 4 * a * c;
    }

    public double getRoot1(){
        double delta = getDiscriminant();
        if(delta < 0){
            return Double.NaN;
        }
        return (-b + Math.sqrt(delta)) / (2 * a);
    }
     public double getRoot2(){
        double delta = getDiscriminant();
        if(delta < 0){
         return Double.NaN;
        }
        return (-b - Math.sqrt(delta)) / (2 * a);
     }
}
