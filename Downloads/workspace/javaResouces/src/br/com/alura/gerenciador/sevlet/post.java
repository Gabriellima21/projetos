package br.com.alura.gerenciador.sevlet;

@WebServlet("/novaEmpresa")
public class post extends HttpServlet{
	
	    private static final long serialVersionUID = 1L;

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
	        System.out.println("Cadastrando nova empresa");

	        String nomeEmpresa = request.getParameter("nome");

	        PrintWriter out = response.getWriter();
	        out.println("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso!</body></html>");
	    }

	}
}
