/* 과제 #5-1 이승주/60191676 */
public class Rect implements Shape {
    int x, y;
    public Rect(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println(x + "x" + y + "크기의 사각형 입니다.");
    }

    @Override
    public double getArea() {
        return x * y;
    }
}
