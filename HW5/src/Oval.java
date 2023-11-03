/* 과제 #5-1 이승주/60191676 */
public class Oval implements Shape {
    int a, b;
    public Oval(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("장축x단축이 "+ a + "x" + b + "인 타원입니다.");
    }

    @Override
    public double getArea() {
        return a*b*PI*0.25;
    }
}
