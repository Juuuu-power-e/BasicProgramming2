/* 과제 #5-2 이승주/60191676 */
package phoneLib;

public interface PhoneInterface {
    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo() {
        System.out.println("** Phone **");
    }
}
