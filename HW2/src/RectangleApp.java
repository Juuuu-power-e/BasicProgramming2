/* << ���� #2-2  �̽��� 60191676 >> */
public class RectangleApp{
    public static void main(String[] args) {
        identify(2);
        Rectangle rA = new Rectangle(3,3,8,5);
        Rectangle rB = new Rectangle(4,2,6,6);
        Rectangle rC = new Rectangle(1,1,10,10);
        rA.show();
        rB.show();
        rC.show();
        System.out.println("rA�� ������ "+rA.square());
        System.out.println("rB�� ������ "+rB.square());
        System.out.println("rC�� ������ "+rC.square());
        if(rC.contains(rA)) System.out.println("rC�� rA�� �����մϴ�.");
        if(rC.contains(rB)) System.out.println("rC�� rB�� �����մϴ�.");
    }
    public static void identify(int n){
        System.out.println("<< ���� #2-"+n+" - �̽��� 60191676 >>");
    }

}
