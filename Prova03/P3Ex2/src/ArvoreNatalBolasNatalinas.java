public class ArvoreNatalBolasNatalinas extends ArvoreNatalDecorator {

	public ArvoreNatalBolasNatalinas(ArvoreNatal arvorenatal) {
		super(arvorenatal);
	}

	@Override
	public String getDescricao(){
		// TODO Auto-generated method stub
		System.out.printf("%s", getArvoreNatal().getDescricao());
		System.out.printf("Adicionando Bolas natalinas a árvore de natal.\n");
		return "";
	}

}