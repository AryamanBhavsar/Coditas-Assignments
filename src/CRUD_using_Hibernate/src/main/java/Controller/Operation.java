package Controller;

import DAO.StudentSchool;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.*;

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

        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.readLine());
        System.out.println("Enter Updated => (name,age,standard)");
     //   String change = sc.readLine();

        StudentSchool studentSchool = session.get(StudentSchool.class,id);
        studentSchool.setName(sc.readLine());
        studentSchool.setAge(Integer.parseInt(sc.readLine()));
        studentSchool.setStandard(Integer.parseInt(sc.readLine()));

        session.saveOrUpdate(studentSchool);
        transaction.commit();
        session.close();


//        try {
//            Query query = session.createQuery("update StudentSchool set "+change+" = :newInfo where id = :studentID");
//            query.setParameter("newInfo", info);
//            query.setParameter("studentID", id);
//            int result = query.executeUpdate();
//            transaction.commit();
//        }
//        catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//        finally {
//            session.close();
//        }

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

    public static List<StudentSchool> fetchByRestriction(int age){
        Session session = configuration.buildSessionFactory().openSession();
        Criteria criteria = session.createCriteria(StudentSchool.class);
        criteria.add(Restrictions.gt("age",age));

        return criteria.list();
    }

    public static List<StudentSchool> fetchByOrder(String order,String pn) {
        Session session = configuration.buildSessionFactory().openSession();
        Criteria criteria = session.createCriteria(StudentSchool.class);

        if(order.equalsIgnoreCase("asc")){
            criteria.addOrder(Order.asc(pn));
        } else if (order.equalsIgnoreCase("desc")) {
            criteria.addOrder(Order.desc(pn));
        }

        return criteria.list();
    }

    public static void singleprojection() throws IOException {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        System.out.print("Enter property name to fetch records: ");
        String propertyName = sc.readLine();

        Criteria criteria = session.createCriteria(StudentSchool.class);
        criteria.setProjection(Projections.property(propertyName));

        List<Object> result = criteria.list();

        for (Object price : result) {
            System.out.println("property Name: " + result);
        }

        tx.commit();
        session.close();
    }

}
