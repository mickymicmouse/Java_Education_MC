package mc.sn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mc.sn.test2.BookTest;
import mc.sn.test2.HResourceDAO;

public class FirstServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("init");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get");
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("post");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
//		out.print("<html>");
//		out.print("<head>");
//		out.print("<style>");
//		out.print("h1 {color : magenta;}");
//		out.print("</style>");
//		out.print("</head>");
//		out.print("<body>");
		out.print("<h1>Welcome! Servlet's World!</h1>");
//		out.print("</body>");
//		out.print("</html>");
		BookTest bt = new BookTest();
		try {
			HResourceDAO dao = new HResourceDAO();
			String line = dao.selectJobs();
			out.print(line);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("destroy");
	}

}
