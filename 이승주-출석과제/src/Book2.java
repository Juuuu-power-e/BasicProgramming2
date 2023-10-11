import java.util.Scanner;

public class Book2 {
    String title, author;

    void show() {
        System.out.println(title+" "+author);
    }

    public Book2(String title, String author) {
        this.title=title;
        this.author=author;
    }

    public static void main(String[] args) {
        Book2[] book2s = new Book2[2];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < book2s.length; i++){
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();
            book2s[i] = new Book2(title,author);
        }
        for(Book2 book2 : book2s){
            book2.show();
        }
        scanner.close();
    }
}