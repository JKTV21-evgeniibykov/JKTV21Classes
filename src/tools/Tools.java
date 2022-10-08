package tools;


import myclasses.Author;
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
public class Tools {
    
    public Book createBook(String title) {
        Book book = new Book();
        book.setTitle(title);
        return book;
    }
    
    public Author createAuthor(String name) {
        Author author = new Author();
        author.setName(name);
        return author;
    }
    
}
