package org.example.wk4;

import org.example.entities.Book;
import org.example.entities.Person;

import java.util.List;

public interface LibraryServiceWk4 {
    List<Book> addBooks(Book book);
    void teacherSeniorJuniorPriorityTw(List<Person> teacher, List<Person> seniorStudentList, List<Person> juniorStudentList, Book book) ;


    void firstComeFirstServedTwo(List<Person> teacher, List<Person> seniorStudentList, List<Person> juniorStudentList, Book book);

}
