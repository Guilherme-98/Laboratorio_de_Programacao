import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		Scanner aux = new  Scanner(System.in);

		int opcao = 0;
		
		
		SortedSet<MusicaMP3> tree = new TreeSet<>(new ComparadorMusica(MusicaMP3.CriterioClassificacao.TITULO));
		
		
		do {
			System.out.println("****************************MENU*************************");
			System.out.println("1- Adicionar música.");
			System.out.println("2- Imprimir todas as músicas por Titulo.");
			System.out.println("3- Imprima só as músicas que estão depois de uma música.");
			System.out.println("4- Imprima só as músicas que estão antes de uma música.");
			System.out.println("0- Sair.");
			System.out.println("*********************************************************");
			System.out.println("Digite a sua opção:");
			
			opcao = sc.nextInt();
			sc.hasNextLine();

			
			switch(opcao) {
			
			
			case 1:
				System.out.println("Digite o titulo da musica:");
				String titulo = aux.nextLine();
				System.out.println("Digite o nome do artista:");
				String artista = aux.nextLine();
				MusicaMP3 novaTree = new MusicaMP3(titulo, artista);
				tree.add(novaTree);
			
				break;
				
			case 2:
				printSet(tree);				
				break;
				
			case 3:
				System.out.println("Digite o titulo da musica:");
				titulo = aux.nextLine();
				MusicaMP3 musicaBusca = new MusicaMP3(titulo, null);
				printSet(tree.tailSet(musicaBusca));
				break;
				
			case 4:
				System.out.println("Digite o titulo da musica:");
				titulo = aux.nextLine();
				System.out.printf("headSet (%s).\n", titulo);
				musicaBusca = new MusicaMP3(titulo, null);
				printSet(tree.headSet(musicaBusca));
				break;
				
			}
			
		}while( opcao != 0);
		
		sc.close();
		aux.close();
		
		
	}
	public static void printSet(SortedSet<MusicaMP3> set) {
		System.out.println("************Lista de músicas*********");
		for (MusicaMP3 musica : set) {
			System.out.println(musica);
		}
		System.out.println("***************************************");
	}

}
