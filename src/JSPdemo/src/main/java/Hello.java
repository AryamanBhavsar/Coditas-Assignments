import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hello from Servlet");


		String a = request.getParameter("no1");
		String b = request.getParameter("no2");

		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);

		int sum = c+d;

		out.println("Sum is::"+sum);

		request.getRequestDispatcher("index1.html").include(request,response);




	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

		LocalDate today = LocalDate.now();
	}

}
