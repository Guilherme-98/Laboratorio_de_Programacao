public class ArvoreNatalFestoes extends ArvoreNatalDecorator {

	public ArvoreNatalFestoes(ArvoreNatal arvorenatal) {
		super(arvorenatal);
	}

	@Override
	public String getDescricao(){
		// TODO Auto-generated method stub
		System.out.printf("%s", getArvoreNatal().getDescricao());
		System.out.printf("Adicionando festões a árvore de natal.\n");
		return "";
	}

}