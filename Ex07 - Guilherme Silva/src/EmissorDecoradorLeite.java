
public class EmissorDecoradorLeite extends EmissorDecorador {

	public EmissorDecoradorLeite(Emissor emissor) {
		super(emissor);
	}

	@Override
	public void enviar(String mensagem) {
		// TODO Auto-generated method stub
		System.out.printf("Adicionando leite ao suco.\n");
		this.getEmissor().enviar(this.addLeite(mensagem));
		
		 
	}
	
	private String addLeite(String mensagem) {
		String fraseAux = "com adicional de leite.";
		return mensagem.concat(" "+fraseAux);
		
	}

	@Override
	public void preco(int valor) {
		// TODO Auto-generated method stub
		this.getEmissor().preco(this.addpreco(valor));
		
	}
	
	private int addpreco(int valor) {
		return valor+1;
		
	}
		

}
