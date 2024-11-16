package Chuong3.B7_Hinh;

public class Circle  implements GeometricObject{

    double Radius=1;

    public Circle(double radius) {
        Radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*Radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Radius*Radius;
    }


}
