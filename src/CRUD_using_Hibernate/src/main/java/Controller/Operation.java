package Controller;

import DAO.StudentSchool;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Operation {
    static Configuration configuration = new Configuration().configure();
    static SessionFactory sessionFactory = configuration.buildSessionFactory();

    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));


    public static void createUser(StudentSchool student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(student);

        transaction.commit();

        session.close();

    }


    public static void SelectUser() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<StudentSchool> studentSchools = new ArrayList<StudentSchool>();

        try {
            Query query = session.createQuery("from StudentSchool");
            studentSchools = query.getResultList();

            Iterator iterator = studentSchools.listIterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
            transaction.commit();
        }
        catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        finally {
            session.close();
        }

    }

    public static void UpdateUser() throws IOException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        int info1;

        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.readLine());
        System.out.println("What you want to Update? (name,age,standard)");
        String change = sc.readLine();
        System.out.println("Enter Information:");

        String info = sc.readLine();


        try {
            Query query = session.createQuery("update StudentSchool set "+change+" = :newInfo where id = :studentID");
            query.setParameter("newInfo", info);
            query.setParameter("studentID", id);
            int result = query.executeUpdate();
            transaction.commit();
        }
        catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        finally {
            session.close();
        }

    }

    public static void DeleteUser() throws IOException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.readLine());

        StudentSchool studentSchool = session.get(StudentSchool.class,id);

        session.delete(studentSchool);

        transaction.commit();

        session.close();

    }

}
