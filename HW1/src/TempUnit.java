import java.util.Scanner;

public class TempUnit {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        identify(1);
        line();
        System.out.println("1. ȭ�� =>  ����");
        System.out.println("2. ���� =>  ȭ��");
        line();
        switch (input("��ȣ�� �����Ͻÿ�: ")){
            case "1" :
                faToCel();
                break;
            case "2" :
                celToFa();
                break;
            default:
                System.out.println("��ȣ�� �߸� �Է��߽��ϴ�.");
        }

    }

    private static void celToFa() {
        float temp = Float.parseFloat(input("���� �µ��� �Է��ϼ���: "))*1.8f + 32;
        System.out.printf("ȭ�� �µ��� %.2f �Դϴ�.", temp);
    }

    private static void faToCel() {
        float temp = (Float.parseFloat(input("ȭ�� �µ��� �Է��ϼ���: "))- 32)/1.8f;
        System.out.printf("���� �µ��� %.2f �Դϴ�.", temp);
    }


    public static void identify(int n){
        System.out.println("<< ���� "+n+" - �̽��� 60191676 >>");
    }
    public static void line(){
        System.out.println("====================================");
    }
    public static String input(String str){
        System.out.print(str);
        return scanner.next();
    }
}
