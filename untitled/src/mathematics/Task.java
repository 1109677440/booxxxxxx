package mathematics;

public class Task {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 定义一个形状数组
        Shape[] s = new Shape[3];
        // 将三角形、矩形、圆形放入数组中
        s[0] = new Triangle(3, 4);
        s[1] = new Rectangle(4, 8, 6);
        s[2] = new Circle(2);

        // 输出面积
        System.out.println("三角形的面积：" + s[0].calArea());
        System.out.println("梯形的面积是：" + s[1].calArea());
        System.out.println("圆形的面积是：" + s[2].calArea());
    }

}
