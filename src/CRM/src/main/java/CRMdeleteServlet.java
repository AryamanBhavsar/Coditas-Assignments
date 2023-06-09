import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CRMdeleteServlet")
public class CRMdeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        int id = Integer.parseInt(req.getParameter("id"));


        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        CRM crm = session.get(CRM.class,id);

        session.delete(crm);
        transaction.commit();

        session.close();

        sessionFactory.close();

        resp.sendRedirect("showCrm");
    }
}
