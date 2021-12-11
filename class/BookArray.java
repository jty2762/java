import java.util.Scanner;
class Book{
    String title, author;
    public Book(String t, String a){
        this.title = t;
        this.author = a;
    }
}

public class BookArray {
    public static void main(String[] args){
        Book [] book = new Book[2];

        Scanner scanner = new Scanner(System.in);
        for(int i =0; i<book.length; i++){
            System.out.print("title>>");
            String title = scanner.nextLine();
            System.out.print("author>>");
            String author = scanner.nextLine();
            book[i] = new Book(title, author);
        }

        for(int i=0; i<book.length; i++)
            System.out.print("("+book[i].title+","+book[i].author+")");
        
        scanner.close();
    }
}
