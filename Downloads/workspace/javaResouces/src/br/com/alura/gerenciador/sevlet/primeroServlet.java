package br.com.alura.gerenciador.sevlet;

import java.io.IOException;

import javax.servlet.http.HttpServletException;
import javax.servlet.http.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet(urlPattern="/oi")
	public class OiMundoServlet extends HttpServlet {

	    @Override
	    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

	        PrintWriter out = rep.getWriter();
	        out.println("<html>");
	        out.println("<body>");
	        out.println("oi mundo, parabens vc escreveu o primeiro servlets.");
	        out.println("</body>");
	        out.println("</html>");

	        System.out.println("o servlet OiMundoServlet foi chamado");
	    }
	}    
	
	

}
