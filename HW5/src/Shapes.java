/* 과제 #5-1 이승주/60191676 */
public class Shapes {
    public static void main(String[] args) {
        System.out.println("< 과제 #5-1 이승주/60191676 >");
        Shape[] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(50,40);
        list[2] = new Rect(10,40);

        for(int i = 0; i < list.length; i++){
            list[i].redraw();
        }
        for (int i = 0; i < list.length; i++){
            System.out.println("면적은 " + list[i].getArea());
        }
    }
}
