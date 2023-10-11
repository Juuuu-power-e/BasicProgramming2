/* 이승주 60191676 퀴즈 1*/

import java.util.Scanner;

public class LogicalOp {
    Scanner scanner;

    public static void main(String[] args) {
        LogicalOp logicalOp = new LogicalOp();
        logicalOp.run();
    }
    public LogicalOp(){
        System.out.println("< 이승주/60191676/퀴즈 1 >");
        scanner = new Scanner(System.in);
    }

    private void run() {
        LogicInput input;
        do {
            try {
                input = input();
            }catch (Exception e){
                return;
            }
            if(isLogi(input)){
                System.out.println("결과: " + input.result());
            }
        }while (!input.equals("stop"));


    }

    private boolean isLogi(LogicInput input) {
        String[] logi = {"OR","or","AND","and"};
        for(String lo : logi){
            if(lo.equals(input.logi)){
                return true;
            }
        }
        return false;
    }

    private LogicInput input() {
        System.out.print("연산을 입력하세요 (예: true OR false) >> ");
        return new LogicInput(scanner.nextBoolean(),scanner.next(),scanner.nextBoolean());
    }

    class LogicInput{
        public boolean tf1;
        public boolean tf2;
        public String logi;

        public LogicInput(boolean tf1, String logi, boolean tf2){
            this.tf1 = tf1;
            this.tf2 = tf2;
            this.logi = logi;
        }
        public boolean result(){
            if(logi.equals("OR")||logi.equals("or")){
                return tf1 || tf2;
            }else {
                return tf1 && tf2;
            }
        }
    }


}