package org.example.wk4;


import org.example.entities.Book;
import org.example.entities.Person;

// Define a functional interface for book processing
@FunctionalInterface
public interface BookProcessor {
    void process(Book book, Person person);
}


