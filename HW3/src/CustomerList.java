/*과제 #3-1 이승주 / 60191676 */

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
        System.out.println("<< 과제 #3-"+n+" - 이승주 60191676 >>");
    }

    public static void main(String[] args) {
        identify(1);
        CustomerList customerList = new CustomerList();
        customerList.run();

    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("고객 수를 입력하시오 >> ");
        Customer[] list = new Customer[scanner.nextInt()];
        System.out.println(list.length+"명의 고객 정보를 입력하시오. >> ");
        for(int i = 0; i < list.length; i++){
            System.out.print("이름 전화번호 등급 >>");
            list[i] = new Customer(scanner.next(),scanner.next(),scanner.next());
        }
        System.out.println("저장되었습니다...");

        System.out.print("검색할 고객명을 입력하시오");
        String input = scanner.next();
        while (!input.equals("stop")){
            Customer searchCustomer = null;
            for(Customer customer : list){
                if(customer.name.equals(input)){
                    searchCustomer = customer;
                }
            }
            if (searchCustomer == null){
                System.out.println(input + " 이 없습니다.");
            }else {
                System.out.println(searchCustomer);
            }
            System.out.print("검색할 고객명을 입력하시오");
            input = scanner.next();
        }
    }
}
