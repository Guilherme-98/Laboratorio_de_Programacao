import java.util.HashSet;
import java.util.Set;

public class Acao implements Subject{
	
	private String nomeRevista;
	
	private String edicaoRevista;
	
	public Acao(String nomeRevista, String edicaoRevista){
		this.nomeRevista = nomeRevista;
		this.edicaoRevista = edicaoRevista;
	}
	
	private Set<Observer> interessados = 
			new HashSet<Observer>();

	@Override
	public void registrarInteressado(Observer interessado){
		this.interessados.add(interessado);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelarInteresse(Observer interessado){
		this.interessados.remove(interessado);		
		// TODO Auto-generated method stub
		
	}
	
	public String getNomeRevista(){
		return this.nomeRevista;
	}
	
	public void setNomeRevista(String nomeRevista){
		this.nomeRevista = nomeRevista;
	}
	
	public String getEdicaoRevista(){
		return this.edicaoRevista;
	}
	
	public void setEdicaoRevista(String edicaoRevista){
		this.edicaoRevista = edicaoRevista;
		this.notificar();
	}

	@Override
	public void notificar(){
		for(Observer interessado : this.interessados){
			interessado.update(this);
		}
		// TODO Auto-generated method stub
	}

}
