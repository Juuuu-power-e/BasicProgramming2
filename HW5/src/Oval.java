/* ���� #5-1 �̽���/60191676 */
public class Oval implements Shape {
    int a, b;
    public Oval(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("����x������ "+ a + "x" + b + "�� Ÿ���Դϴ�.");
    }

    @Override
    public double getArea() {
        return a*b*PI*0.25;
    }
}
