package org.example;

import org.example.entities.Book;
import org.example.entities.Person;
import org.example.serviceImplematn.*;
import org.example.serviceImplematn.LibraryServiceImplementationTwo;
//import org.example.week4.LibraryImplementationWek4;
import org.example.wk4.LibraryImplementationWk4;

import java.util.List;

import static org.example.serviceImplematn.StudentDetailsImpl.readExcelDetails;
import static org.example.serviceImplematn.TeacherServiceImpl.readExcelDetail;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //TeacherServiceImplementation//
        System.out.println("------------------------------------Teacher Details-------------------------");
        TeacherServiceImpl teacherService = new TeacherServiceImpl();
        List<Person> teacher = readExcelDetail("Dataset.csv");

        //PrincipalServiceImplementation//
        PrincipalServiceImpl principalService = new PrincipalServiceImpl();


        //StudentDetailsImplementation//
        System.out.println("---------------------------------Student Details--------------------------");
        List<Person> studentDetails = readExcelDetails("Dataset2.csv", "");


     ///////////////////------------------BOOK LIBRARY------------------/////////////////////////////////////
        System.out.println("////////............................LIST OF BOOKS IN LIBRARY ........................//////");

        Book book1 = new Book("The Lean Startup", "Eric Ries", "Management", 3);
        Book book2 = new Book("Good to Great", "Jim Collins", "Management", 3);
        Book book3 = new Book("Leaders Eat Last", "Simon Sinek", "Leadership", 3);
        Book book4 = new Book("Drive: The Surprising Truth About What Motivates Us", "Daniel H. Pink", "Motivation", 3);
        Book book5 = new Book("The 7 Habits of Highly Effective People", "Stephen R. Covey", "Leadership", 2);
        Book book6 = new Book("Thinking, Fast and Slow", "Daniel Kahneman", "Decision Making", 20);

///////////////////------------------Priority Queue (Implementation 1)------------------/////////////////////////////////////
        LibraryServiceImplementation librarianService = new LibraryServiceImplementation();
        System.out.println("-----------PRIORITY QUEQUE-----------");
        librarianService.teacherSeniorJuniorPriority(TeacherServiceImpl.teacher, StudentDetailsImpl.seniorStudentList, StudentDetailsImpl
                .juniorStudentList, book1);
        System.out.println();

        ///////////////////-----------------FIFO (FIRST IN FIRST OUT - Implementation 2)------------------/////////////////////////////////////
        System.out.println("FIFO");
        librarianService.firstComeFirstServed(TeacherServiceImpl.teacher, StudentDetailsImpl.seniorStudentList,  StudentDetailsImpl.juniorStudentList, book2);



////////////----------------WEEK 4---------(Implementation)////////////

        System.out.println("\n" + "////////////----------------WEEK 4---------(Implementation)////////////");
        LibraryServiceImplementationTwo librarianServiceTwo = new LibraryServiceImplementationTwo();


        ////////////----------------PRIORITY QUEUE----------(Implementation 1)////////////
        System.out.println("-----------PRIORITY QUEQUE-----------");
        librarianServiceTwo.teacherSeniorJuniorPriorityTwo(TeacherServiceImpl.teacher, StudentDetailsImpl.seniorStudentList, StudentDetailsImpl
                .juniorStudentList, book4);
        System.out.println();

        ///////////////////-----------------FIFO (FIRST IN FIRST OUT - Implementation 2)------------------/////////////////////////////////////
        System.out.println("----------------------------FIFO2-----------------------------");
        librarianServiceTwo.firstComeFirstServedTwo(TeacherServiceImpl.teacher,
                StudentDetailsImpl.seniorStudentList,  StudentDetailsImpl.juniorStudentList, book5);
        System.out.println();


        System.out.println("---TESTING WEEK4---");
       LibraryImplementationWk4 librarianWk4 =  new LibraryImplementationWk4();

        System.out.println("---------PRIORITY  QUEUE-----");
        librarianWk4.teacherSeniorJuniorPriorityTw(TeacherServiceImpl.teacher,
                StudentDetailsImpl.seniorStudentList,  StudentDetailsImpl.juniorStudentList, book3);
        System.out.println();

//        System.out.println("-------------weekkk----------");
//        LibraryImplementationWek4 libraryImpWk4 = new LibraryImplementationWek4();
//        libraryImpWk4.teacherSeniorJuniorPriorityTwo(TeacherServiceImpl.teacher,
//                StudentDetailsImpl.seniorStudentList,  StudentDetailsImpl.juniorStudentList, book3);
//
//        librarianWk4.firstComeFirstServed(TeacherServiceImpl.teacher,
//                StudentDetailsImpl.seniorStudentList,  StudentDetailsImpl.juniorStudentList, book3);
//        System.out.println();

//        LibraryImplementationWk4 libraryyService = new LibraryImplementationWk4();
//
//
//
//        libraryyService(TeacherServiceImpl.teacher,
//               StudentDetailsImpl.seniorStudentList,  StudentDetailsImpl.juniorStudentList, book3);
//
//        // Simulate first-come-first-served collection
//        libraryService.firstComeFirstServed(TeacherServiceImpl.teacher,
//              StudentDetailsImpl.seniorStudentList,  StudentDetailsImpl.juniorStudentList, book3);
//
//
//        LibraryLogger.log("Priority Queue Wk4");
//
//LibraryImplementationWk4 librianServiceWk4 = new LibraryImplementationWk4();
//
//librianServiceWk4.teacherSeniorJuniorPriorityTwo(TeacherServiceImpl.teacher, StudentDetailsImpl
//        .seniorStudentList, StudentDetailsImpl.juniorStudentList, book3);
//
//        LibraryLogger.log("FIFO Wk4" +"\n");
//librianServiceWk4.firstComeFirstServedTwo(TeacherServiceImpl.teacher,
//        StudentDetailsImpl.seniorStudentList, StudentDetailsImpl.juniorStudentList, book3);

    }
    }






