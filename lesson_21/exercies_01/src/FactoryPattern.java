public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        if(shape1 != null){
            shape1.draw();
        }else{
            System.out.println("Invalid shape type!");
        }

        // Create Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        if(shape2 != null){
            shape2.draw();
        }

        // Create Rectangle
        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        if(shape3 != null){
            shape3.draw();
        }
    }
}
