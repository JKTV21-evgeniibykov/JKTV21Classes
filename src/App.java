
import console.Console;
import myclasses.Book;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pupil
 */
public class App {
    
    public void run() {
        
        // Add books
        Console console = new Console();
        
        Book[] books = new Book[console.n()];   // create empty books array
        books = console.add(books.length);      // imput items in books array
        console.print(books);                   // print added books
        
    }
    
}
