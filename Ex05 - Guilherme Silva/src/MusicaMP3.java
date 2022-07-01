
public class MusicaMP3 {
	
	enum CriterioClassificacao{
		TITULO,
		ARTISTA
	}
	
	private String titulo;
	private String artista;
	
	

	public MusicaMP3(String pTitulo, String pArtista) {
		this.titulo = pTitulo;
		this.artista  = pArtista;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public String toString() {
		return this.titulo+"-"+this.artista;
	}
}
