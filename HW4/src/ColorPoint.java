
public class ColorPoint extends Point{
    private String color;

    public ColorPoint() {
        super(0,0);
        this.color = "BLACK";
    }
    private void setXY(int x, int y) {
        move(x, y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color+"���� ("+getX()+","+getY()+")�� ��";
    }

    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString() + "�Դϴ�.");

        ColorPoint cp = new ColorPoint();
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "�Դϴ�.");
    }
}
