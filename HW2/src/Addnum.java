/* << ���� #2-1  �̽��� 60191676 >> */
import java.util.Scanner;

public class Addnum {

    private String[] inputStrings;
    private int[] outputInts;
    public Addnum(String input) {
        inputStrings = input.split(" ");
        outputInts = new int[inputStrings.length];
    }

    private void print() {
        convert();
        printArray();
        printSum();
    }

    private void printSum() {
        int sum = 0;
        for(int i : outputInts){
            sum += i;
        }
        System.out.println("��: "+sum);
    }

    private void printArray() {
        String printArray = "���� �迭:";
        for(int i : outputInts){
            printArray += " " + i;
        }
        System.out.println(printArray);
    }

    private void convert() {
        for (int i = 0; i < inputStrings.length; i++){
            try{
                outputInts[i] = Integer.parseInt(inputStrings[i]);
            } catch (NumberFormatException e) {
                outputInts[i] = 0;
            }
        }
    }

    public static void identify(int n){
        System.out.println("<< ���� #2-"+n+" - �̽��� 60191676 >>");
    }
    public static void main(String[] args) {
        identify(1);
        Scanner scanner = new Scanner(System.in);
        Addnum addnum = new Addnum(scanner.nextLine());
        addnum.print();
    }


}
