public class Rect implements Shape {
    int x, y;
    public Rect(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println(x + "x" + y + "ũ���� �簢�� �Դϴ�.");
    }

    @Override
    public double getArea() {
        return x * y;
    }
}
