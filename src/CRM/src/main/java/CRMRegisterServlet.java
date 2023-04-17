import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@WebServlet("/CRMRegisterServlet")
public class CRMRegisterServlet extends HttpServlet {

    static Configuration configuration = new Configuration().configure();
    static SessionFactory sessionFactory = configuration.buildSessionFactory();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");



        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");
        String city = req.getParameter("city");
        String mobile = req.getParameter("mobile");

        CRM crm = new CRM();
        crm.setFname(fname);
        crm.setLname(lname);
        crm.setEmail(email);
        crm.setPass(pass);
        crm.setCity(city);
        crm.setMobile(mobile);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(crm);

        transaction.commit();
        session.close();

        RequestDispatcher rd = req.getRequestDispatcher("adminlogin.jsp");
        rd.forward(req,resp);
    }

        public static void SelectUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<CRM> listCRM = new ArrayList<CRM>();

        try {
            Query query = session.createQuery("from CRM");
            listCRM = query.getResultList();
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

        request.setAttribute("listCRM",listCRM);
        request.getRequestDispatcher("showCrm.jsp").forward(request,response);
    }
}
