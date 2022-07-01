package br.uel.produtos;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ExcluirCarrinhoServlet
 */
@WebServlet("/excluircarrinho")
public class ExcluirCarrinhoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExcluirCarrinhoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("sequenciaCarrinho");
		
		int idInt = new Integer(id);
		
		LinkedList<String> listaCarrinhosAdd = 
				(LinkedList)request.getSession().getAttribute("listaCarrinhosAdd");
		
				
		listaCarrinhosAdd.remove(idInt);
		
		//request.getSession().setAttribute("listaBuscados", listaBuscados);
		
		RequestDispatcher view = 
				request.getRequestDispatcher("buscar-carrinho.jsp");
		
		view.forward(request, response);
		
	}

}
