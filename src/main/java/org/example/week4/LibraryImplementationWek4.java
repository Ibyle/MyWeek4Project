//package org.example.week4;
//
//import org.example.entities.Book;
//import org.example.entities.Person;
//import org.example.enums.Role;
//
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//
//public class LibraryImplementationWek4<T> implements LibraryServiceWek4 {
//
//    public static List<Book> managementBooks = new ArrayList<>();
//
//    @Override
//    public List<Book> addBooks(Book book) {
//        managementBooks.add(book);
//        LibraryLoogger.log("Book added: " + book.getTitle());
//        return managementBooks;
//    }
//
//    @Override
//    public <T extends Person> void teacherSeniorJuniorPriorityTwo(List<T> teacher, List<T> seniorStudentList,
//                                                                  List<T> juniorStudentList, Book book) {
//        processBooks(teacher, seniorStudentList, juniorStudentList, book, person -> processTeacherSeniorJunior(book, person));
//    }
//
//
//    @Override
//    public <T extends Person> void firstComeFirstServedTwo(List<T> teacher, List<T> seniorStudentList,
//                                                           List<T> juniorStudentList, Book book) {
//        processBooks(teacher, seniorStudentList, juniorStudentList, book, person ->
//                processTeacherSeniorJunior(book));
//    }
//
//
//
//
//    private void processBooks(List<T> group1, List<T> group2, List<T> group3, Book book, BookProcessor<T> bookProcessor) {
//
//        try {
//            Queue<T> personQueue = Stream.of(group1, group2, group3)
//                    .flatMap(Collection::stream)
//                    .collect(Collectors.toCollection(LinkedList::new));
//
//            personQueue.forEach(person -> bookProcessor.process(book, person));
//
//            if (book.getQuantity() == 0) {
//                LibraryLoogger.log("All books titled: " + book.getTitle() + " TAKEN!");
//            }
//        } catch (Exception e) {
//            LibraryLoogger.log("Error processing books: " + e.getMessage());
//            throw new RuntimeException(e);
//        }
//    }
//
//    private void processTeacherSeniorJunior(Book book, Person currentPerson) {
//        LibraryLoogger.log(currentPerson.getFirstName() + ", a " + currentPerson.getRole() +
//                ", Collected Book Titled: " + book.getTitle());
//        book.setQuantity(book.getQuantity() - 1);
//        LibraryLoogger.log("The book titled: " + book.getTitle() + " remains " +
//                book.getQuantity() + " copies\n");
//    }
//
//    private void processFirstComeFirstServed(Book book, Person currentPerson) {
//        LibraryLoogger.log(currentPerson.getFirstName() + ", a " + currentPerson.getRole() +
//                ", Collected Book Titled: " + book.getTitle());
//        book.setQuantity(book.getQuantity() - 1);
//        LibraryLoogger.log("The book titled: " + book.getTitle() + " remains " +
//                book.getQuantity() + " copies\n");
//    }
//}
