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
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer[] list = new Customer[scanner.nextInt()];
        for(int i = 0; i < list.length; i++){

        }
        String input = scanner.next();
        while (!input.equals("stop")){

        }
    }
}
