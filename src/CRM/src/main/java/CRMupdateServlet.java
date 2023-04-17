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

@WebServlet("/CRMupdateServlet")
public class CRMupdateServlet extends HttpServlet {

    Configuration configuration = new Configuration().configure();
    SessionFactory sessionFactory = configuration.buildSessionFactory();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String email = req.getParameter("email");
        String city = req.getParameter("city");
        String mobile = req.getParameter("mobile");

        System.out.println(fname);

        CRM crm = new CRM();
        crm.setFname(fname);
        crm.setLname(lname);
        crm.setEmail(email);
        crm.setCity(city);
        crm.setMobile(mobile);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.saveOrUpdate(crm);

        transaction.commit();
        session.close();


        RequestDispatcher rd = req.getRequestDispatcher("showCrm");
        rd.forward(req,resp);
    }
}
