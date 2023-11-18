package org.example.wk4;



import org.example.entities.Book;
import org.example.entities.Person;
import org.example.enums.Role;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Create a separate class for logging
public class LibraryLogger {
    private static final Logger LOGGER = Logger.getLogger(LibraryLogger.class.getName());

   public static void log(String message) {
        LOGGER.info(message);
    }


    // Generic method to process books using a BookProcessor
    private void processBooks(List<Person> group1, List<Person> group2, List<Person> group3,
                              Book book, BookProcessor bookProcessor) {
        try {
            Queue<Person> personQueue = Stream.of(group1, group2, group3)
                    .flatMap(Collection::stream)
                    .collect(Collectors.toCollection(LinkedList::new));

            personQueue.stream()
                    .filter(currentPerson -> Arrays.asList(Role.values())
                            .contains(currentPerson.getRole()))
                    .forEach(currentPerson -> bookProcessor.process(book, currentPerson));

            if (book.getQuantity() == 0) {
                LibraryLogger.log("All books titled: " + book.getTitle() + " TAKEN!");
            }
        } catch (Exception e) {
            LibraryLogger.log("Error processing books: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    // Process for teacher, senior, and junior roles
    private void processTeacherSeniorJunior(Book book, Person currentPerson) {
        LibraryLogger.log(currentPerson.getFirstName() + ", a " + currentPerson.getRole() +
                ", Collected Book Titled: " + book.getTitle());
        book.setQuantity(book.getQuantity() - 1);
        LibraryLogger.log("The book titled: " + book.getTitle() + " remains " +
                book.getQuantity() + " copies\n");
    }

    // Process for first-come-first-served
    private void processFirstComeFirstServed(Book book, Person currentPerson) {
        LibraryLogger.log(currentPerson.getFirstName() + ", a " + currentPerson.getRole() +
                ", Collected Book Titled: " + book.getTitle());
        book.setQuantity(book.getQuantity() - 1);
        LibraryLogger.log("The book titled: " + book.getTitle() + " remains " +
                book.getQuantity() + " copies\n");
    }
}
