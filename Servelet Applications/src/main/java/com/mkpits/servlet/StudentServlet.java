package com.mkpits.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentSrevlet
 */
@WebServlet(name = "StudentServlet", urlPatterns = { "/StudentServlet" })
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set conflict type
	     response.setContentType("text/html");
				
	    //get PrintWriter
		PrintWriter out = response.getWriter();
				
		//generate html content
		out.println("<html><body>");
		out.println("<h2>Welcome</h2>");
		out.println("<hr>");
		out.println("The Student is Confirmed :"+ request.getParameter("fname")+
				"   "+request.getParameter("lname"));
		out.println("</body></html>");
	}

}
