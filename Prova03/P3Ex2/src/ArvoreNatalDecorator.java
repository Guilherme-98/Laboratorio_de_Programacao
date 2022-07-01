
public abstract class ArvoreNatalDecorator implements ArvoreNatal{
	
	private ArvoreNatal arvorenatal;
	
	public ArvoreNatalDecorator(ArvoreNatal arvorenatal) {
		this.arvorenatal = arvorenatal;
	}
	
	public abstract String getDescricao();
	
	
	public ArvoreNatal getArvoreNatal(){
		return this.arvorenatal;
	}

}
