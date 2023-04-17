import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CustomerUpdateServlet")
public class CustomerUpdateServlet extends HttpServlet {

    Configuration configuration = new Configuration().configure();
    SessionFactory sessionFactory = configuration.buildSessionFactory();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        int id = Integer.parseInt(req.getParameter("id"));
        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String email = req.getParameter("email");
        String city = req.getParameter("city");
        String mobile = req.getParameter("mobile");


        Customer customer = session.get(Customer.class,id);
        customer.setFname(fname);
        customer.setLname(lname);
        customer.setEmail(email);
        customer.setCity(city);
        customer.setMobile(mobile);



        session.saveOrUpdate(customer);

        transaction.commit();
        session.close();


        RequestDispatcher rd = req.getRequestDispatcher("ShowCustomer");
        rd.forward(req,resp);
    }
}
