/* ���� #5-2 �̽���/60191676 */
package phoneApp;

import phoneLib.SmartPhone;

public class InterfaceEx {
    public static void main(String [] args) {
        System.out.println("< ���� #5-2 �̽���/60191676 >");
        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.sendSMS();
        phone.receiveSMS();
        phone.play();
        phone.stop();
        System.out.println("7�� 10�� ���ϸ� " +
                phone.calculate(3,5));
        phone.schedule();
    }
}