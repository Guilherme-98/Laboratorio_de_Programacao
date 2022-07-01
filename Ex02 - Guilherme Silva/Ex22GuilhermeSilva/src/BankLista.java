import java.util.Scanner;

public class BankLista {

		public static void main(String[] args) {
			ListFunctions func = new ListFunctions();
			int op;
			Scanner input = new Scanner(System.in);
			
			while(true){
				System.out.printf("**************************\n");
				System.out.printf("* 1 - Entrar na fila     *\n");
				System.out.printf("* 2 - Desistir da fila   *\n");
				System.out.printf("* 3 - Atender cliente    *\n");
				System.out.printf("* 4 - Buscar posição     *\n");
				System.out.printf("* 5 - Imprimir fila      *\n");
				System.out.printf("* 0 - Sair do menu       *\n");
				System.out.printf("**************************\n");
				System.out.print("Escolha uma opcao:");
				op = input.nextInt();
				System.out.printf("\n");
				switch (op){
					case 1:
						func.entrarfila();
						break;
					case 2:
						func.desistirFila();
						break;
					case 3:
						func.atenderCliente();
						break;
					case 4:
						func.buscarPosicao();
						break;
					case 5:
						 func.imprimirFila();
						 break;
					case 0:
						System.out.printf("Programa encerrado.\n");
						return;
					default:
						System.out.printf("Opção Inválida.Tente novaemnete.\n");
						break;
				}
			}
		}
	}
