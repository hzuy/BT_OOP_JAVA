package Chuong3.B7_Hinh;

public class ResizeableCircle extends Circle implements Resizeable {
    public ResizeableCircle(double Radius) {
        super(Radius);
    }


    @Override
    public void resize(int percent) {
        this.Radius=percent;
    }
}
