import java.util.LinkedList;
import java.util.Random;

public class Correntista implements Runnable {
private int id;

public int getId() {
	return  this.id;
}
public void setId(int id){
	this.id = id;
}

public void run() {
		
		for(int i = 0; i<20; i++) {
			double valorFinal = 0;
			Random rand = new Random();
			int conta1 = rand.nextInt(10);
			int conta2 = rand.nextInt(10);
			
			ContaCorrente c1 = ContaCorrente.contas.get(conta1);
			ContaCorrente c2 = ContaCorrente.contas.get(conta2);
			synchronized(ContaCorrente.contas){
				double valorT = rand.nextInt((int)c1.getSaldo());
				c1.sacar(valorT);
				c2.depositar(valorT);
				System.out.printf("Id ContaCorrente %d ---- Conta origem: %s ---- Conta de destino: %s ---- Movimetação:%.2f\n",
						this.id,c1.getCliente(),c2.getCliente(),valorT);
				
				for(int j = 0; j<10; j++) {
					valorFinal += ContaCorrente.contas.get(j).getSaldo();
				}
				System.out.printf("Saldo total do banco:%.2f\n", valorFinal);
			}
		}
	}
}
