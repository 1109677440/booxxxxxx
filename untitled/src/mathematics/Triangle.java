package mathematics;

public class Triangle extends Shape {
    // 属性
    private double a, h;

    // 构造方法
    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }
    @Override
    double calArea() {
        return a * h / 2;
    }

}
