package Tabuada;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Tabuada")
public class Tabuada extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Tabuada() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<ul>");
		int i = 7;
		  
		  for(int x = 1; x < 11; x++) {
			 
			  out.print("<li>" + x + " x " + i + " = " + i * x + "</br>" + "</li>");
			  
		  }
		out.print("</ul>");
		out.print("</body></html>");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
