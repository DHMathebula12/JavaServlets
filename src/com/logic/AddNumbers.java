package com.logic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddNumbers
 */
@WebServlet("/AddNumbers")
public class AddNumbers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNumbers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//Get Parameters passed from the jsp index page. - First Number = a
		String as=request.getParameter("a");
		int a=Integer.parseInt(as);
		
		//get Parameters passed from the jsp index page. - Second Number = b
		String bs=request.getParameter("b");
		int b=Integer.parseInt(bs);
		
		//call the Addition method from the Addition class
		Addition obj = new Addition();
		int result = obj.add(a, b);
		
		//Set Response back to index JSP page.
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Addition Result</h1>");
		out.print("The result is : <b>" + result+"</b>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
