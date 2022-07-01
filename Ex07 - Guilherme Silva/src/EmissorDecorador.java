
public abstract class EmissorDecorador implements Emissor{
	
	private Emissor emissor;
	
	public EmissorDecorador(Emissor emissor) {
		this.emissor = emissor;
	}
	
	public abstract void enviar(String mensagem);
	
	public abstract void preco(int valor);
	
	public Emissor getEmissor(){
		return this.emissor;
	}

}
