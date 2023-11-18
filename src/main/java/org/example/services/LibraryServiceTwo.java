package org.example.services;

import org.example.entities.Book;
import org.example.entities.Person;

import java.util.List;

public interface LibraryServiceTwo {
        List<Book> addBook(Book book);

        boolean teacherSeniorJuniorPriorityTwo(List<Person> teacher, List<Person> seniorStudentList, List<Person> juniorStudentList, Book book);

        void firstComeFirstServedTwo(List<Person> teacher, List<Person> seniorStudentList, List<Person> juniorStudentList, Book book);
}


