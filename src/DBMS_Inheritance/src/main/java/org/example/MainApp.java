package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Employee e1 = new Employee(1,"Aryaman");
        PartTimeEmp e2 = new PartTimeEmp(2,"Shyam",500,30);
        FullTimeEmp e3 = new FullTimeEmp(3,"Ganesh",25000,400,12);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(e1);
        session.persist(e1);
        session.save(e2);
        session.persist(e2);
        session.save(e3);
        session.persist(e3);

        transaction.commit();

        session.close();

    }
}

