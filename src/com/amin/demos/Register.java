package com.amin.demos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// values will show in url
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String userName = request.getParameter("userName");
		String passwd = request.getParameter("passwd");
		String gender = request.getParameter("gender");		
		String[] hobbies = request.getParameterValues("hobbies");
		String country = request.getParameter("country");
		String[] languages = request.getParameterValues("languages");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<div>");
		out.println("<p>User Name : " + userName + "</p>");
		out.println("<p>Password : " + passwd + "</p>");
		out.println("<p>Sex : " + gender + "</p>");
		out.println("<p>Hobbies : </p>");
		for (int i = 0; i < hobbies.length; i++) {
			out.println(hobbies[i] + "<br>");
		}
		out.println("<p>Country : " + country + "</p>");
		out.println("<p>Languages Known : </p>");
		for (int i = 0; i < languages.length; i++) {
			out.println(languages[i] + "<br>");
		}
		out.println("</div>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// values will not show in url
		doGet(request, response);
//		String userName = request.getParameter("userName");
//		String passwd = request.getParameter("passwd");
//		String gender = request.getParameter("gender");		
//		String[] hobbies = request.getParameterValues("hobbies");
//		String country = request.getParameter("country");
//		String[] languages = request.getParameterValues("languages");
//		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<h3>Processing is done for POST Request </h3>");
//		out.println("<div>");
//		out.println("<p>User Name : " + userName + "</p>");
//		out.println("<p>Password : " + passwd + "</p>");
//		out.println("<p>Sex : " + gender + "</p>");
//		out.println("<p>Hobbies : </p>");
//		for (int i = 0; i < hobbies.length; i++) {
//			out.println(hobbies[i] + "<br>");
//		}
//		out.println("<p>Country : " + country + "</p>");
//		out.println("<p>Languages Known : </p>");
//		for (int i = 0; i < languages.length; i++) {
//			out.println(languages[i] + "<br>");
//		}
//		out.println("</div>");
	}

}
