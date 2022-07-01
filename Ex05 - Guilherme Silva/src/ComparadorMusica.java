import java.util.Comparator;

public class ComparadorMusica  implements Comparator<MusicaMP3>{
	
	private MusicaMP3.CriterioClassificacao criterio;
	
	public ComparadorMusica(MusicaMP3.CriterioClassificacao pCriterio) {
		this.criterio = pCriterio;
	}

	@Override
	public int compare(MusicaMP3 o1, MusicaMP3 o2) {
			return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
		
	}

}
