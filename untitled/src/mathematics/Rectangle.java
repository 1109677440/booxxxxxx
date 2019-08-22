package mathematics;

public class Rectangle extends Shape {
    private double a, c, h;

    public Rectangle(double a, double c,double h) {
        this.a = a;
        this.c = c;
        this.h = h;
    }
    @Override
    double calArea() {
        double x;
        x = a+c;
        x = x*h;
        x = x/2;
        return x;

    }

}
