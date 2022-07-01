import java.util.ArrayList;
import java.util.Scanner;

public class ListFunctions {
	public String name, id;
	public int hour, minute;
	public int idInt, position;
	public boolean exist;
	public boolean old;
	public String service;
	public int ver = -1;
	public int verPref = 2;
	public int Pref;
	Scanner input = new Scanner(System.in);
	
	ArrayList<String> fila = new ArrayList<String>();
	ArrayList<String> idade = new ArrayList<String>();
	
	public void entrarfila() {
		System.out.printf("Informe o nome da pessoa que ira entrar na fila:");
		name = input.next();
		fila.add(name);
		System.out.printf("Horario de chegada:\n");
		System.out.printf("Hora(s): ");
		hour = input.nextInt();
		System.out.printf("Minuto(s): ");
		minute = input.nextInt();
		System.out.print("Idade: ");
		id = input.next();
		idade.add(id);
		System.out.print("Serviço a ser realizado para o cliente: ");
		service = input.next();
		ver++;
		System.out.printf("Cadastro realizado.\n");
	}
	public void desistirFila() {
		System.out.printf("Informe a posicao da pessoa na fila para sua remoção: ");
		position = input.nextInt();
		if(position > ver) {
			System.out.printf("\nNumero informado ultrapassa o tamanho da fila.\n");
		}
		else {
			fila.remove(position);
			idade.remove(position);
			System.out.printf("\nCliente removido com sucesso.\n");
			ver--;
		}
	}
	public void buscarPosicao() {
		System.out.print("Qual o nome do cliente?\n");
		name = input.next();
		exist = fila.contains(name);
		if(exist == false) {
			System.out.println("\nCliente inexistente.\n");
		}
		else {
			System.out.printf("\nO cliente %s esta na posicao %d da fila\n", name, fila.indexOf(name));
		}
	}
	public void imprimirFila() {
		for (String aux : fila) {
	         System.out.printf("%s\n", aux);
	      }
		 System.out.printf("\n");
	}
	
	public void atenderCliente() {
		if(ver >= 0) {
			for (String aux : idade) {
				 idInt = Integer.parseInt(aux);
				 if(idInt >= 65) {
					 old = true; 
					 Pref = idade.indexOf(aux);
					 break;
				 }
			}
		    
			if(old == true && verPref > 0) {
				System.out.printf("\nCliente preferencial atendido.\n");
				fila.remove(Pref);
				idade.remove(Pref);
				ver--;
				verPref--;
				old = false;
				return;
			}
			
			else {
				System.out.printf("\nCliente atendido.\n");
				fila.remove(0);
				idade.remove(0);
				ver--;
				if(verPref == 0) {
					verPref = 2;
				}
				return;
			}
			
		}
		else {
			System.out.println("\nNenhum cliente na fila para ser atendido.\n");
		}
	}

}
