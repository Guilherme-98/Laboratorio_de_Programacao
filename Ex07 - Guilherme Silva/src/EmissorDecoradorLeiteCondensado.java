
public class EmissorDecoradorLeiteCondensado extends EmissorDecorador {

	public EmissorDecoradorLeiteCondensado(Emissor emissor) {
		super(emissor);
	
	}

	@Override
	public void enviar(String mensagem) {
		// TODO Auto-generated method stub
		System.out.printf("Adicionando leite condensado ao suco.\n");
		this.getEmissor().enviar(this.addLeiteCondensado(mensagem));
		
	}
	
	private String addLeiteCondensado(String mensagem) {
		String fraseAux = "com adicional de leite condensado.";
		return mensagem.concat(" "+fraseAux);
		
	}

	@Override
	public void preco(int valor) {
		// TODO Auto-generated method stub
		this.getEmissor().preco(this.addpreco(valor));
		
	}
	
	private int addpreco(int valor) {
		return valor+2;
		
	}

}
