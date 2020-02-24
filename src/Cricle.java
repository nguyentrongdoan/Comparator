public class Cricle extends Shape {
    private double radius = 1.0;

    public Cricle() {
    }
    public Cricle(double radius) {
        this.radius = radius;
    }

    public Cricle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "A Cricle with radius = " + getRadius() + "which is a subclass of" + super.toString();
    }
}
