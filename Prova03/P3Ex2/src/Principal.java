import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		int opcao;
		
		ArvoreNatal arvorenatal = new ArvoreNatalBasica();
		
		do{
			System.out.println("****************************MENU************************* ");
			System.out.printf("1 - Adicionar luzes a árvore de natal.                  *\n");
			System.out.printf("2 - Adicionar bolas natalinas a árvore de natal.        *\n");
			System.out.printf("2 - Adicionar festões a árvore de natal.                *\n");
			System.out.printf("0 - Sair.                                               *\n");
			System.out.println("********************************************************* ");
			System.out.println("Digite a sua opção:");
			
			opcao = sc.nextInt();
			
			switch(opcao) {
			
			case 1:
				arvorenatal = new ArvoreNatalLuzes(arvorenatal);
				arvorenatal.getDescricao();
				System.out.printf("\n");
				break;
				
			case 2:
				arvorenatal = new ArvoreNatalBolasNatalinas(arvorenatal);
				arvorenatal.getDescricao();
				System.out.printf("\n");
				break;		
				
			case 3:
				arvorenatal = new ArvoreNatalFestoes(arvorenatal);
				arvorenatal.getDescricao();
				System.out.printf("\n");
				break;			
				
			}
			
		}while(opcao != 0);
		
		System.out.printf("\n\nSua árvore natalina.\n");
		System.out.printf("%s",arvorenatal.getDescricao());
		
		System.out.printf("\n\nPrograma Finalizado...\n");
	
		sc.close();	
	}
	
}