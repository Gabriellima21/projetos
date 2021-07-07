package br.com.alura.gerenciador.servlet;

import java.io.IOException;

/**
*Servlet implementation class ListaEmpresasSerlvet
*/
@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
    * @see HttpServlet#HttpServlet()
    */
    public ListaEmpresasServlet() {
        super();
        // TODO auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
        // TODO Auto-generated method stub
        response.getWriter().append(""Served at: ").append(request.getContextPath());
    }
} 