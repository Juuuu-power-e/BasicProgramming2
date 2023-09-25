import java.util.Scanner;

public class RspGame {

    private static Scanner scanner;
    private static final String QUIT_KEYWORD = "quit";
    private String hawa;
    private String adam;

    public static void main(String[] args) {
        RspGame rspGame = new RspGame();
        scanner = new Scanner(System.in);
        identify(2);
        rspGame.gameSet();
        rspGame.adam = input("�ƴ�");

        while (!rspGame.adam.equals(QUIT_KEYWORD)){
            rspGame.hawa = input("�Ͽ�");
            System.out.println(rspGame.gameResult());
            System.out.println();
            rspGame.adam = input("�ƴ�");
        }
        rspGame.hawa = input("����");
    }

    private String gameResult() {
        String winner = "x";
        if(hawa.equals("����")){
            if(adam.equals("����")){
                return "�����ϴ�";
            } else if (adam.equals("����")) {
                winner = "�ƴ�";
            } else if (adam.equals("��")) {
                winner = "�Ͽ�";
            }
        } else if (hawa.equals("����")) {
            if(adam.equals("����")){
                return "�����ϴ�";
            } else if (adam.equals("��")) {
                winner = "�ƴ�";
            } else if (adam.equals("����")) {
                winner = "�Ͽ�";
            }
        } else if (hawa.equals("��")) {
            if(adam.equals("��")){
                return "�����ϴ�";
            } else if (adam.equals("����")) {
                winner = "�ƴ�";
            } else if (adam.equals("����")) {
                winner = "�Ͽ�";
            }
        }

        return winner+"�� �̰���ϴ�.";
    }

    private void gameSet() {
        System.out.println();
        System.out.println("���������� �����Դϴ�.");
        System.out.println("����, ����, �� �߿��� �Է��ϼ���");
        System.out.println("������ �ߴ��ϰ� ������ \"quit\"�� �Է��ϼ���");
    }


    public static void identify(int n){
        System.out.println("<< ���� "+n+" - �̽��� 60191676 >>");
    }
    public static void line(){
        System.out.println("====================================");
    }
    public static String input(String str){
        System.out.print(str+" >> ");
        return scanner.next();
    }
}
