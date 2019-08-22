package mathematics;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }
    @Override
    double calArea() {
        return 3.14 * r * r;
    }

}
