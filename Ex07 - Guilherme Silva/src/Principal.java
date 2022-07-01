import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		Scanner aux = new  Scanner(System.in);
		String mensagem = null;
		
		
		int opcao;
		
		System.out.printf("Informe a fruta do seu suco:");
		mensagem = aux.nextLine();
		Emissor emissor = new EmissorBasico();
		System.out.printf("\nEmissor basico.\n");
		emissor.enviar(mensagem);
		emissor.preco(10);
		System.out.printf("\n");
		
		do{
			System.out.println("****************************MENU*************************");
			System.out.printf("1 - Adicionar leite ao suco.\n");
			System.out.printf("2 - Adicionar leite condensado ao suco.\n");
			System.out.printf("0 - sair.\n");
			System.out.println("*********************************************************");
			System.out.println("Digite a sua opção:");
			
			opcao = sc.nextInt();
			
			switch(opcao) {
			
			case 1:
				emissor = new EmissorDecoradorLeite(emissor);
				System.out.printf("\nEmissor com Leite.\n");
				emissor.enviar(mensagem);
				emissor.preco(10);
				System.out.printf("\n");
				break;
				
			case 2:
				emissor= new EmissorDecoradorLeiteCondensado(emissor);
				System.out.printf("\nEmissor com Leite Condensado.\n");
				emissor.enviar(mensagem);
				emissor.preco(10);
				System.out.printf("\n");
				break;			
				
			}
			
		}while(opcao != 0);
		
		System.out.printf("Programa Finalizado...\n");
		
		sc.close();
		aux.close();	

	}

	
}
