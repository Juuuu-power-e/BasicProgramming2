// 2023-2 �������α׷���2 �߰����� �ڵ� ����
// �̽��� 60191676

import java.util.Scanner;

public class Converter {
    private Scanner scanner;
    public static void main(String[] args) {
        System.out.println("< �̽���/60191676 - ������2 �߰����� >");
        System.out.println();
        Converter converter = new Converter();
        converter.run();
    }

    private double doubleInput(){
        System.out.print("��ȯ�� ��: ");
        return scanner.nextDouble();
    }

    private void run() {
        System.out.println("1. kg ==> lb");
        System.out.println("2. lb ==> kg");
        System.out.println("3. cm ==> ft");
        System.out.println("4. ft ==> cm");
        System.out.println("===================");
        System.out.print("���� ��ȯ�� �����Ͻÿ�>>");
        this.scanner = new Scanner(System.in);
        switch (scanner.nextInt()){
            case 1 -> System.out.printf("��ȯ���: %.2f\n",UnitConverter.toPound(doubleInput()));
            case 2 -> System.out.printf("��ȯ���: %.2f\n",UnitConverter.toKilogram(doubleInput()));
            case 3 -> System.out.printf("��ȯ���: %.2f\n",UnitConverter.toFeet(doubleInput()));
            case 4 -> System.out.printf("��ȯ���: %.2f\n",UnitConverter.toCentimeter(doubleInput()));
        }
        scanner.close();
    }
}
