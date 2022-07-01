package br.uel.produtos;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdicionarCarrinhoServlet
 */
@WebServlet("/addcarrinho")
public class AdicionarCarrinhoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdicionarCarrinhoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ProdutoDAO produtoDao = 
				new ProdutoDAO();
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		Produto produto = produtoDao.buscarPorId(id);
		String nome = produto.getNome();
		
		HttpSession session = request.getSession();
		
		Object listaCarrinhosObj = session.getAttribute("listaCarrinhosAdd");
		
		if(listaCarrinhosObj == null) {
			LinkedList<String> listaCarrinhos = 
					new LinkedList<String>();
			
			listaCarrinhos.add(nome);
			
			session.setAttribute("listaCarrinhosAdd", listaCarrinhos);
			
		} else {
			LinkedList<String> listaCarrinhos = 
					(LinkedList)listaCarrinhosObj;
			
			listaCarrinhos.add(nome);
		}
		
		
		RequestDispatcher view = 
				request.getRequestDispatcher("buscar-carrinho.jsp");
		
		view.forward(request, response);
	}

}
