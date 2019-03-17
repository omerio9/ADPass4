public class Good_example {
    public interface Shape{
        public double calculateArea();
    }

    public class Rectangle implements Shape{
        double length;
        double width;
        public double calculateArea(){
            return length * width;
        }
    }

    public class Circle implements Shape{
        public double radius;
        public double calculateArea(){
            return (22/7)*radius*radius;
        }
    }
    public class AreaCalculator {
        public double calculateShapeArea(Shape shape) {
            return shape.calculateArea();
        }
    }
    }
