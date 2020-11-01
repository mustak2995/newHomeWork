package com.hefshine.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServ
 */
public class DemoServ extends HttpServlet {


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		String uname=request.getParameter("username");
		
	 	String password=request.getParameter("pasword"); 

		PrintWriter out=response.getWriter();
		
		out.print("<h1>Welcome to Jsp</h1>");
		
		out.print("<table>");
		
		out.print("</table>");
		
	
	}

	

}
