import java.util.InputMismatchException;
import java.util.Scanner;

/*과제 #3-2 이승주 / 60191676 */
public class Calculator {
    public static void identify(int n){
        System.out.println("<< 과제 #3-"+n+" - 이승주 60191676 >>");
    }
    private Scanner scanner;
    public Calculator(){
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        identify(2);
        Calculator calculator = new Calculator();
        calculator.calculate();
    }

    private void calculate() {
        boolean rightInput = false;
        String ans = "";
        while (!rightInput) {
            try {
                System.out.print("두 정수와 연산자(+,-,*,/,^)를 입력하시오 (예: 10 / 4): ");
                int num1 = scanner.nextInt();
                String operator = scanner.next();
                int num2 = scanner.nextInt();
                rightInput = true;
                switch (operator) {
                    case "+" -> ans = "add("+num1+", "+num2+") = " + (num1 + num2);
                    case "-" -> ans = "subtract("+num1+", "+num2+") = " + (num1 - num2);
                    case "*" -> ans = "multiply("+num1+", "+num2+") = " + (num1 * num2);
                    case "/" -> ans = "divide("+num1+", "+num2+") = " +((double)num1 / num2);
                    case "^" -> ans = "power("+num1+", "+num2+") = " + (int)(Math.pow(num1, num2));
                    default -> {
                        rightInput = false;
                        System.out.println("처리할 수 없는 연산자입니다. 다시 입력하세요!");
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                rightInput = false;
                scanner.nextLine();
            }
        }
        System.out.println(ans);
    }

}
