
public class PessoaFisica implements Observer{
	
	private String nome;
	
	private String cpf;
	
	public PessoaFisica (String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
		
	}
	

	@Override
	public void update(Subject subject) {
		System.out.printf("Nome:%s --- ",this.nome);
		System.out.printf("CPF:%s\n",this.cpf);
		Acao acao = (Acao) subject;
		System.out.printf("Revista:%s --- ",acao.getNomeRevista());
		System.out.printf("Edicão:%s\n\n",acao.getEdicaoRevista());
		// TODO Auto-generated method stub
		
	}

}
