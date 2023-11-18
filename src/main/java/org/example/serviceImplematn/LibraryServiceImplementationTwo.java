package org.example.serviceImplematn;

import org.example.comparator.RoleComparator;
import org.example.entities.Book;
import org.example.entities.Person;
import org.example.enums.Role;
import org.example.services.LibraryServiceTwo;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LibraryServiceImplementationTwo implements LibraryServiceTwo {
    public static List<Book> managementBooks = new ArrayList<>();

    @Override
    public List<Book> addBook(Book book) {
        managementBooks.add(book);
        managementBooks.forEach(System.out::println);
        return managementBooks;
    }

    @Override
    public boolean teacherSeniorJuniorPriorityTwo(List<Person> teacher, List<Person> seniorStudentList, List<Person> juniorStudentList, Book book) {
        try {
            List<Person> person = new ArrayList<>();
            if (!teacher.isEmpty() && !juniorStudentList.isEmpty() && !seniorStudentList.isEmpty()) {
                person.add(teacher.get(3));
                person.add(teacher.get(2));
                person.add(juniorStudentList.get(2));
                person.add(seniorStudentList.get(3));
                person.add(juniorStudentList.get(2));
                person.add(seniorStudentList.get(1));
            }

            person.stream()
                    .filter(currentPerson -> book.getQuantity() > 0)
                    .filter(currentPerson -> currentPerson.getRole() == Role.Teacher ||
                            currentPerson.getRole() == Role.Senior_Student ||
                            currentPerson.getRole() == Role.Junior_Student)
                    .forEach(currentPerson -> {
                        System.out.println(currentPerson.getFirstName() + ", a " +
                                currentPerson.getRole() + ", Collected Book Titled: " + book.getTitle());

                        book.setQuantity(book.getQuantity() - 1);
                        System.out.println("The book titled: " + book.getTitle() +
                                " remains " + book.getQuantity() + " copies\n");
                    });

            if (book.getQuantity() == 0) {
                System.out.println("Not available at the moment: " + book.getTitle() + " TAKEN!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    @Override
    public void firstComeFirstServedTwo(List<Person> teacher, List<Person> seniorStudentList, List<Person> juniorStudentList, Book book) {
        try {
            Queue<Person> person = new LinkedList<>();
            if (!teacher.isEmpty() && !juniorStudentList.isEmpty() && !seniorStudentList.isEmpty()) {
                person.add(seniorStudentList.get(3));
                person.add(juniorStudentList.get(2));
                person.add(juniorStudentList.get(2));
                person.add(seniorStudentList.get(3));
                person.add(teacher.get(2));
                person.add(teacher.get(3));
            }

            person.stream()
                    .filter(currentPerson -> book.getQuantity() > 0)
                    .filter(currentPerson -> currentPerson.getRole() == Role.Senior_Student ||
                            currentPerson.getRole() == Role.Junior_Student ||
                            currentPerson.getRole() == Role.Teacher)
                    .forEach(currentPerson -> {
                        System.out.println(currentPerson.getFirstName() + ", a " +
                                currentPerson.getRole() + ", Collected Book Titled: " + book.getTitle());

                        book.setQuantity(book.getQuantity() - 1);
                        System.out.println("The book titled: " + book.getTitle() +
                                " remains " + book.getQuantity() + " copies\n");
                    });

            if (book.getQuantity() == 0) {
                System.out.println("All books titled: " + book.getTitle() + " TAKEN!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
