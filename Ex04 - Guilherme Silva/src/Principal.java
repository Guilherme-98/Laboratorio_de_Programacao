import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		
		LinkedList<ContaCorrente> listaC = new LinkedList<ContaCorrente>();
		LinkedList<Correntista> listaCorrentista = new LinkedList<Correntista>();
		
		for(int i = 0; i<10; i++) {	
			ContaCorrente conta = new ContaCorrente();
			System.out.printf("Informe o nome do cliente:");
			nome = input.next();
			conta.setCliente(nome);
			conta.setSaldo(10000);
			listaC.add(conta);
		}
			ContaCorrente.contas = listaC;
			
		for(int i = 0; i<5; i++) {
			Correntista correntista = new Correntista();
			correntista.setId(i);
			listaCorrentista.add(correntista);
		}
		
		Thread t0 = new Thread(listaCorrentista.get(0));
		Thread t1 = new Thread(listaCorrentista.get(1));
		Thread t2 = new Thread(listaCorrentista.get(2));
		Thread t3 = new Thread(listaCorrentista.get(3));
		Thread t4 = new Thread(listaCorrentista.get(4));
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			t0.join();
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
