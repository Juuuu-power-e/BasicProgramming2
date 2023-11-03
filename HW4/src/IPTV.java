/*���� #4-1 �̽��� / 60191676 */
public class IPTV extends ColorTV{
    String address;
    public static void identify(int n){
        System.out.println("<< ���� #4-"+n+" - �̽��� 60191676 >>");
    }
    public IPTV(String address, int size, int color) {
        super(size, color);
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void printProperty() {
        System.out.println("���� IPTV�� "+address+" �ּ��� "+getSize()+"��ġ "+getColor()+"�÷�");
    }

    public static void main(String[] args) {
        identify(1);
        ColorTV myTV = new ColorTV(32,1024);
        myTV.printProperty();
        IPTV iptv = new IPTV("192.1.1.2",48, 2048);
        iptv.printProperty();
    }
}
