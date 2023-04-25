package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class OperationsLibrary {
    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryaman");


    public static void create() throws IOException {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Enter Name:");
        String name = sc.readLine();

        Library library = new Library();
        library.setName(name);

        entityManager.getTransaction().begin();

        entityManager.persist(library);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public static void Retrieve(){

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Library> libraries = entityManager.createQuery("Select l from Library l",Library.class).getResultList();

        entityManager.getTransaction().commit();

        for(Library l:libraries){

            System.out.println("ID:"+l.getId());
            System.out.println("NAME:" + l.getName());
            System.out.println("------------------------");
        }
        System.out.println("");

    }

    public static void Update() throws IOException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.readLine());
        System.out.println("Enter Updated Name:");
        String name = sc.readLine();

        entityManager.getTransaction().begin();

        Library library = entityManager.find(Library.class,id);
        library.setName(name);
        entityManager.merge(library);

        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public static void Delete() throws IOException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.readLine());

        entityManager.getTransaction().begin();

        Library library = entityManager.find(Library.class,id);
        entityManager.remove(library);

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}

