/* ���� #5-1 �̽���/60191676 */
public class Circle implements Shape{
    int r;
    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("�������� "+ this.r +"�� ���Դϴ�");
    }

    @Override
    public double getArea() {
        return r*r*PI;
    }
}
