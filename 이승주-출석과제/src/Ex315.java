import java.util.Scanner;
public class Ex315 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        while(true){
            System.out.print("나눔당할 수:");
            int a=scanner.nextInt();
            System.out.print("나눌수:");
            int b=scanner.nextInt();
            try{
                System.out.println(a+"를"+b+"로 나누면 몫은"+a/b+"입니다");
                break;
            }
            catch(ArithmeticException e){
                System.out.println("0으로 나눌 수 없습니다! 다시입력하세요");
            }
        }
        scanner.close();
    }
}