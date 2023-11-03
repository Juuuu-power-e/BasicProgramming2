/* 과제 #5-1 이승주/60191676 */
public class Circle implements Shape{
    int r;
    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 "+ this.r +"인 원입니다");
    }

    @Override
    public double getArea() {
        return r*r*PI;
    }
}
