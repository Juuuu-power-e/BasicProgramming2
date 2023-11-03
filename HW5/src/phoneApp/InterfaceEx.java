/* 과제 #5-2 이승주/60191676 */
package phoneApp;

import phoneLib.SmartPhone;

public class InterfaceEx {
    public static void main(String [] args) {
        System.out.println("< 과제 #5-2 이승주/60191676 >");
        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.sendSMS();
        phone.receiveSMS();
        phone.play();
        phone.stop();
        System.out.println("7과 10를 더하면 " +
                phone.calculate(3,5));
        phone.schedule();
    }
}