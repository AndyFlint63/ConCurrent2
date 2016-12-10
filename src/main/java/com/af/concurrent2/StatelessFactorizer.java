package com.af.concurrent2;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.af.annotations.ThreadSafe;

/**
 * Servlet implementation class StatelessFactorizer
 */
@WebServlet("/StatelessFactorizer")
@ThreadSafe
public class StatelessFactorizer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatelessFactorizer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
        String message = "Completed doGet " + this.getServletName();

        request.setAttribute("message", message);
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
        request.getRequestDispatcher("/MyJsp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	 
	        String message = "Completed doPost " + this.getServletName();

	        request.setAttribute("message", message);
	        request.getRequestDispatcher("/MyJsp.jsp").forward(request, response);
		
		doGet(request, response);
	}
	

	
	public void service(HttpServletRequest request, HttpServletResponse response) {
		BigInteger i = extractFromRequest(request);
		BigInteger[] factors = factor(i);
		encodeIntoResponse(response, factors);
		try {
			doGet(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
    void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {
    }
	
    BigInteger[] factor(BigInteger i) {
        // Doesn't really factor
        return new BigInteger[] { i };
    }
	
	private BigInteger extractFromRequest(ServletRequest req) {
		int i1 = 1;
		String s1 = "7";
		
		
		return new BigInteger( (String) s1);
	
		
		
	}

}
