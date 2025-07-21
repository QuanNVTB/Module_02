public class Square extends Shape implements Colorable {
        private double side;

        public Square() {
            this.side = 1.0;
        }

        public Square(double side) {
            this.side = side;
        }

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }

        @Override
        public void resize(double percent) {
            side += side * percent / 100;
        }

        @Override
        public void howToColor() {
            System.out.println("Color all four sides.");
        }

        @Override
        public String toString() {
            return "Square with side = " + side;

    }
}
