public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI * getRadius() * getRadius() + 2*Math.PI * getRadius() * height;
    }

    @Override
    public double acreage() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "Circle" + super.toString() +
                '}';
    }
}
