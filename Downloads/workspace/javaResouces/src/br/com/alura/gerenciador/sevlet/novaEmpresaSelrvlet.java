package br.com.alura.gerenciador.sevlet;

public class novaEmpresaSelrvlet extends HttpServlet {
	@WebServlet("/novaEmpresa")
	

	    private static final long serialVersionUID = 1L;

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
	        System.out.println("Cadastrando nova empresa");

	        String nomeEmpresa = request.getParameter("nome");
	        Empresa empresa = new Empresa();
	        empresa.setNome(nomeEmpresa);

	        PrintWriter out = response.getWriter();
	        out.println("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso!</body></html>");
	    }
}
	
	
	
	
  }
}
