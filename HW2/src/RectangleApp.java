/* << 과제 #2-2  이승주 60191676 >> */
public class RectangleApp{
    public static void main(String[] args) {
        identify(2);
        Rectangle rA = new Rectangle(3,3,8,5);
        Rectangle rB = new Rectangle(4,2,6,6);
        Rectangle rC = new Rectangle(1,1,10,10);
        rA.show();
        rB.show();
        rC.show();
        System.out.println("rA의 면적은 "+rA.square());
        System.out.println("rB의 면적은 "+rB.square());
        System.out.println("rC의 면적은 "+rC.square());
        if(rC.contains(rA)) System.out.println("rC는 rA를 포함합니다.");
        if(rC.contains(rB)) System.out.println("rC는 rB를 포함합니다.");
    }
    public static void identify(int n){
        System.out.println("<< 과제 #2-"+n+" - 이승주 60191676 >>");
    }

}
