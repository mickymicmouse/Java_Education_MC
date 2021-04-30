package mc.sn.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mc.sn.model.BusinessService;

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
		System.out.println("work");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Welcome!! Servlet</h1>");
		BusinessService bs = new BusinessService();
		ArrayList result = bs.checkWorkingDatabase();
		if(result !=null) {
			out.print("db is working");
		} else {
			out.print("db is not working");
		}
		
		for (int i =0; i<result.size(); i++) {
			out.print("<h2>"+result.get(i)+"</h2>");
		}
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}
}








