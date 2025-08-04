public class Shape {
    private String color = "Green";
    private boolean isFilled = true;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.isFilled = filled;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        this.isFilled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + color
                + "and "
                + (isFilled() ? "filled" : "not filled");
    }
}
