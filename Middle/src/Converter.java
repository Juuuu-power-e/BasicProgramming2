// 2023-2 기초프로그래밍2 중간시험 코딩 문제
// 이승주 60191676

import java.util.Scanner;

public class Converter {
    private Scanner scanner;
    public static void main(String[] args) {
        System.out.println("< 이승주/60191676 - 기초프2 중간시험 >");
        System.out.println();
        Converter converter = new Converter();
        converter.run();
    }

    private double doubleInput(){
        System.out.print("변환할 값: ");
        return scanner.nextDouble();
    }

    private void run() {
        System.out.println("1. kg ==> lb");
        System.out.println("2. lb ==> kg");
        System.out.println("3. cm ==> ft");
        System.out.println("4. ft ==> cm");
        System.out.println("===================");
        System.out.print("단위 변환을 선택하시오>>");
        this.scanner = new Scanner(System.in);
        switch (scanner.nextInt()){
            case 1 -> System.out.printf("변환결과: %.2f\n",UnitConverter.toPound(doubleInput()));
            case 2 -> System.out.printf("변환결과: %.2f\n",UnitConverter.toKilogram(doubleInput()));
            case 3 -> System.out.printf("변환결과: %.2f\n",UnitConverter.toFeet(doubleInput()));
            case 4 -> System.out.printf("변환결과: %.2f\n",UnitConverter.toCentimeter(doubleInput()));
        }
        scanner.close();
    }
}
