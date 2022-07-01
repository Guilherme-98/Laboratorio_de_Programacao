public class EmissorBasico implements Emissor{

	@Override
	public void enviar(String mensagem) {
		System.out.printf("Enviando uma mensagem.\n");
		System.out.printf("Suco:%s",mensagem);
		
	}

	@Override
	public void preco(int valor) {
		System.out.printf("\nO valor do suco:%d.00 reais\n",valor);

	}

}
