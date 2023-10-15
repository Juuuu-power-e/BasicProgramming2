/*���� #3-1 �̽��� / 60191676 */

import java.util.Scanner;
import java.util.Vector;

public class CustomerList extends Vector<CustomerList.Customer> {
    class Customer{
        private String name;

        private String phone;
        private String rating;
        public Customer(String name, String phone, String rating){
            this.phone = phone;
            this.rating = rating;
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public String getRating() {
            return rating;
        }

        @Override
        public String toString() {
            return   name + ':' + phone +  " / " + rating ;
        }
    }
    public static void identify(int n){
        System.out.println("<< ���� #3-"+n+" - �̽��� 60191676 >>");
    }

    public static void main(String[] args) {
        identify(1);
        CustomerList customerList = new CustomerList();
        customerList.run();

    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("�� ���� �Է��Ͻÿ� >> ");
        Customer[] list = new Customer[scanner.nextInt()];
        System.out.println(list.length+"���� �� ������ �Է��Ͻÿ�. >> ");
        for(int i = 0; i < list.length; i++){
            System.out.print("�̸� ��ȭ��ȣ ��� >>");
            list[i] = new Customer(scanner.next(),scanner.next(),scanner.next());
        }
        System.out.println("����Ǿ����ϴ�...");

        System.out.print("�˻��� ������ �Է��Ͻÿ�");
        String input = scanner.next();
        while (!input.equals("stop")){
            Customer searchCustomer = null;
            for(Customer customer : list){
                if(customer.name.equals(input)){
                    searchCustomer = customer;
                }
            }
            if (searchCustomer == null){
                System.out.println(input + " �� �����ϴ�.");
            }else {
                System.out.println(searchCustomer);
            }
            System.out.print("�˻��� ������ �Է��Ͻÿ�");
            input = scanner.next();
        }
    }
}
