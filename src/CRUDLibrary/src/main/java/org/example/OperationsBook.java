package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class OperationsBook {
    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryaman");


    public static void create() throws IOException {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Enter Name:");
        String name = sc.readLine();
        System.out.println("Enter Price:");
        int price = Integer.parseInt(sc.readLine());
        System.out.println("Enter Publisher:");
        String publisher = sc.readLine();
        System.out.println("Enter Library ID:");
        int libId = Integer.parseInt(sc.readLine());



        Library library = entityManager.find(Library.class,libId);
        Book book = new Book();

        List<Book>books = new ArrayList<>();
        books.add(book);
        book.setName(name);
        book.setPrice(price);
        book.setPublisher(publisher);
        book.setLibrary(library);
        library.setBooks(books);


        entityManager.getTransaction().begin();

        entityManager.persist(book);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public static void Retrieve(){

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Book> books = entityManager.createQuery("Select b from Book b",Book.class).getResultList();

        entityManager.getTransaction().commit();

        for(Book b:books){

            System.out.println("ID:"+b.getId());
            System.out.println("NAME:" + b.getName());
            System.out.println("PRICE: Rs."+b.getPrice());
            System.out.println("PUBLISHER:"+b.getPublisher());
            System.out.println("------------------------");
        }
        System.out.println("");

    }

    public static void Update() throws IOException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.readLine());
        System.out.println("Enter Updated Price:");
        int price = Integer.parseInt(sc.readLine());

        entityManager.getTransaction().begin();

        Book book = entityManager.find(Book.class,id);
        book.setPrice(price);
        entityManager.merge(book);

        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public static void Delete() throws IOException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.readLine());

        entityManager.getTransaction().begin();

        Book book = entityManager.find(Book.class,id);
        entityManager.remove(book);

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
