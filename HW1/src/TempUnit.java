import java.util.Scanner;

public class TempUnit {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        identify(1);
        line();
        System.out.println("1. 화씨 =>  섭씨");
        System.out.println("2. 섭씨 =>  화씨");
        line();
        switch (input("번호를 선택하시오: ")){
            case "1" :
                faToCel();
                break;
            case "2" :
                celToFa();
                break;
            default:
                System.out.println("번호를 잘못 입력했습니다.");
        }

    }

    private static void celToFa() {
        float temp = Float.parseFloat(input("섭씨 온도를 입력하세요: "))*1.8f + 32;
        System.out.printf("화씨 온도는 %.2f 입니다.", temp);
    }

    private static void faToCel() {
        float temp = (Float.parseFloat(input("화씨 온도를 입력하세요: "))- 32)/1.8f;
        System.out.printf("섭씨 온도는 %.2f 입니다.", temp);
    }


    public static void identify(int n){
        System.out.println("<< 과제 "+n+" - 이승주 60191676 >>");
    }
    public static void line(){
        System.out.println("====================================");
    }
    public static String input(String str){
        System.out.print(str);
        return scanner.next();
    }
}
