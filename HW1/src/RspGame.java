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
        rspGame.adam = input("아담");

        while (!rspGame.adam.equals(QUIT_KEYWORD)){
            rspGame.hawa = input("하와");
            System.out.println(rspGame.gameResult());
            System.out.println();
            rspGame.adam = input("아담");
        }
        rspGame.hawa = input("히와");
    }

    private String gameResult() {
        String winner = "x";
        if(hawa.equals("가위")){
            if(adam.equals("가위")){
                return "비겼습니다";
            } else if (adam.equals("바위")) {
                winner = "아담";
            } else if (adam.equals("보")) {
                winner = "하와";
            }
        } else if (hawa.equals("바위")) {
            if(adam.equals("바위")){
                return "비겼습니다";
            } else if (adam.equals("보")) {
                winner = "아담";
            } else if (adam.equals("가위")) {
                winner = "하와";
            }
        } else if (hawa.equals("보")) {
            if(adam.equals("보")){
                return "비겼습니다";
            } else if (adam.equals("가위")) {
                winner = "아담";
            } else if (adam.equals("바위")) {
                winner = "하와";
            }
        }

        return winner+"가 이겼습니다.";
    }

    private void gameSet() {
        System.out.println();
        System.out.println("가위바위보 게임입니다.");
        System.out.println("가위, 바위, 보 중에서 입력하세요");
        System.out.println("게임을 중단하고 싶으면 \"quit\"를 입력하세요");
    }


    public static void identify(int n){
        System.out.println("<< 과제 "+n+" - 이승주 60191676 >>");
    }
    public static void line(){
        System.out.println("====================================");
    }
    public static String input(String str){
        System.out.print(str+" >> ");
        return scanner.next();
    }
}
