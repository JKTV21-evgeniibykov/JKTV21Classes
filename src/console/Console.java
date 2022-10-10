package console;

import java.util.Scanner;
import myclasses.Book;
import tools.Tools;

/**
 *
 * @author evgen
 */
public class Console {

    Scanner scanner = new Scanner(System.in);
    Tools tools = new Tools();

    public int n() {
        System.out.print("What books create? ");
        int n = scanner.nextInt();
        return n;
    }
    
    public Book[] add(int n) {

        String imput;
        Book[] books = new Book[n];
        
        for (int i=0; i<n; i++) {
            System.out.print("\nTittle book No." + (i+1) + "? ");
            imput = scanner.next();
            Book book = new Book(imput);
            while (!imput.equals("-")) {
                System.out.print("Add author? [name or -] ");
                imput = scanner.next();
                if (!imput.equals("-")) {
                    book.addAuthor(tools.createAuthor(imput));
                }
            }
            books[i] = book;
        }
        
        return books;
    }

    public void print(Book[] books) {
        System.out.println("\nBooks added:");
        for (int i=0; i<books.length; i++) {
            System.out.println(books[i].toString());
        }
    }

}
