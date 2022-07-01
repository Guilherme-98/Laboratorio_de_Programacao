package br.uel.labprog.control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import br.uel.labprog.model.Produto;

@Named
@SessionScoped
public class ProdutosEscolhidosController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	List<Produto> listaProdutosEscolhidos;
	
	public List<Produto> getListaProdutosEscolhidos() {
		return listaProdutosEscolhidos;
	}

	public void setListaProdutosEscolhidos(List<Produto> lista) {
		this.listaProdutosEscolhidos = lista;
	}
	
	public void adicionarEscolhido(Produto produto) {
		
		if (!listaProdutosEscolhidos.contains(produto)) {
			listaProdutosEscolhidos.add(produto);
			FacesContext.getCurrentInstance().addMessage(null, 
					new FacesMessage("Produto escolhido com sucesso"));
		} else {
			FacesContext.getCurrentInstance().addMessage(null, 
					new FacesMessage("Produto já presente na lista"));
		}
		
		
		
	}
	
	public void remover(Produto produto) {
		
		listaProdutosEscolhidos.remove(produto);
		
	}


	@PostConstruct
	public void init() {
		listaProdutosEscolhidos = 
				new ArrayList<Produto>();
	}

}
