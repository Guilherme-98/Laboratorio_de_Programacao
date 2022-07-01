
public class ArvoreNatalLuzes extends ArvoreNatalDecorator {

	public ArvoreNatalLuzes(ArvoreNatal arvorenatal) {
		super(arvorenatal);
	}

	@Override
	public String getDescricao(){
		// TODO Auto-generated method stub
		System.out.printf("%s", getArvoreNatal().getDescricao());
		System.out.printf("Adicionando luzes a árvore de natal.\n");
		return "";
	}

}