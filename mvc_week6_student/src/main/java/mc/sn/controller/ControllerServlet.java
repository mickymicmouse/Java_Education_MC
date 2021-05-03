package mc.sn.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mc.sn.service.BusinessService;

public class ControllerServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
		 
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String command = req.getParameter("command");
		System.out.println("work");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		//out.print("<h1>Welcome!! Servlet</h1>");
		System.out.println(command);
		BusinessService bs = new BusinessService();
		HttpSession storage = req.getSession();
		String url = null;
		if (command.equals("1")) {
			String result = bs.checkWorkingDatabase();
			storage.setAttribute("result", result);
			url = "./day27/output_view.jsp";
		} else if(command.equals("2")) {
			ArrayList<String> data = bs.getJobs();
			storage.setAttribute("data", data);
			url = "./day27/output_view2.jsp";
		}
		resp.sendRedirect(url);
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}
}








