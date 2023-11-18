package org.example.services;

import org.example.entities.Book;
import org.example.entities.Person;

import java.util.List;

public interface LibraryServiceWeek4 {
    List<Book> addBook(Book book);

    boolean teacherSeniorJuniorPriority(List<Person> teacher, List<Person> seniorStudentList, List<Person> juniorStudentList, Book book);

    void firstComeFirstServed(List<Person> teacher, List<Person> seniorStudentList, List<Person> juniorStudentList, Book book);
}
