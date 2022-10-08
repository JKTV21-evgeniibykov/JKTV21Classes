package console;

import java.util.Scanner;
import myclasses.Book;
import tools.Tools;

/**
 *
 * @author evgen
 */
public class Console {

    public Console() {
        
        Scanner scanner = new Scanner(System.in);
        Tools tools = new Tools();

        System.out.print("What books create? ");
        int n = scanner.nextInt();

        Book[] books = new Book[n];
        String imput;
        
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
        
        System.out.println("\nAdded books:");
        for (int i=0; i<books.length; i++) {
            System.out.println(books[i].toString());
        }

//        Tools tools = new Tools();
//        Book book3 = new Book("New Book");
//        book3.addAuthor(tools.createAuthor("New Author"));
//        
//        Book[] books = new Book[5];
//        
//        System.out.println(book3.toString());
    }
    
}
