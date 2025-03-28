public class Circle extends Shape{


    private int radius;

    public Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "location=" + getLocation();
        '}';



    }
    @Override
    public double area() {
        return Math.PI *
    }
}










