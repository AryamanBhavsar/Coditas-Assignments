package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class Query {
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryaman");

    public static void Query1() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> cq = cb.createQuery(Book.class);
        Root<Book> root = cq.from(Book.class);
        cq.select(root).where(cb.greaterThan(root.get("price"), 400));
        TypedQuery<Book> query = entityManager.createQuery(cq);
        List<Book> books = query.getResultList();

        for (Book b : books) {

            System.out.println("NAME:" + b.getName());
            System.out.println("PRICE: Rs." + b.getPrice());
            System.out.println("------------------------");
        }
        System.out.println("");
    }

    public static void Query2() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> cq = cb.createQuery(Book.class);
        Root<Book> root = cq.from(Book.class);
        cq.select(root);
        TypedQuery<Book> query = entityManager.createQuery(cq);
        List<Book> books = query.getResultList();

        entityManager.getTransaction().commit();

        for (Book b : books) {

            System.out.println("NAME:" + b.getName());
            System.out.println("PUBLISHER:" + b.getPublisher());
            System.out.println("------------------------");
        }
        System.out.println("");
    }

    public static void Query3() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> cq = cb.createQuery(Book.class);
        Root<Book> root = cq.from(Book.class);
        cq.select(root).where(cb.between(root.get("price"), 200, 400));
        List<Book> books = entityManager.createQuery(cq).getResultList();

        for (Book b : books) {

            System.out.println("NAME:" + b.getName());
            System.out.println("PRICE:" + b.getPrice());
            System.out.println("------------------------");
        }
        System.out.println("");
    }

    public static void Query4() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        String prefix = "J";

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> cq = cb.createQuery(Book.class);
        Root<Book> root = cq.from(Book.class);
        cq.select(root).where(cb.like(root.get("name"), prefix + "%"));
        TypedQuery<Book> query = entityManager.createQuery(cq);
        List<Book> books = query.getResultList();

        for (Book b : books) {

            System.out.println("NAME:" + b.getName());
            System.out.println("------------------------");
        }
        System.out.println("");
    }


}
