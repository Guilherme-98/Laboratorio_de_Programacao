import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op;
		String tipo, nome,conta;
		double saldo, limite, saque, deposito;
		
		ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
		
		do {
			System.out.printf("        ***   MENU   ***        \n");
			System.out.printf("1 - CADASTAR A CONTA DE UM CLIENTE\n");
			System.out.printf("2 - SACAR UM VALOR DA SUA CONTA\n");
			System.out.printf("3 - ATUALIZAR UMA CONTA POUPANÇA COM O SEU RENDIMENTO\n");
			System.out.printf("4 - DEPOSITAR UM DETERMINADO VALOR NA CONTA\n");
			System.out.printf("5 - MOSTAR O SALDO DA SUA CONTA\n");
			System.out.printf("6 - CALCULAR OS TRIBUTOS DE UM CONTA\n");
			System.out.printf("7 - CALCULAR A TAXA DE ADMINISTRAÇÃO DE UMA CONTA DE INVESTIMENTO\n");
			System.out.printf("0 - SAIR DO MENU\n");
			System.out.printf("******************************************************************\n");
			System.out.printf("Escolha uma opção:");
			op = input.nextInt();
			System.out.printf("\n");
			
			switch(op){
				
				case 1:
					System.out.printf("Conta Corrente:cc\nConta Poupança:cp\nConta Investimento:ci\n");
					System.out.printf("Escolha seu tipo de conta:");
					tipo = input.next();
					if(tipo.equals("cc")) {
						ContaBancaria cb =  new ContaCorrente();
						System.out.printf("Informe o nome do cliente:");
						nome = input.next();
						((ContaCorrente) cb).setCliente(nome);
						System.out.printf("Informe  o numero da conta:");
						conta = input.next();
						((ContaCorrente) cb).setNumeroConta(conta);
						System.out.printf("Informe o saldo da conta:");
						saldo = input.nextDouble();
						BigDecimal aux = new BigDecimal(saldo);
						((ContaCorrente) cb).setSaldo(aux);
						System.out.printf("Informe o limite da conta:");
						limite = input.nextDouble();
						BigDecimal aux2 = new BigDecimal(limite);
						((ContaCorrente) cb).setLimite(aux2);
						contas.add(cb);
					}
					else if(tipo.equals("cp")) {
						ContaBancaria cb =  new ContaPoupanca();
						System.out.printf("Informe o nome do cliente:");
						nome = input.next();
						((ContaPoupanca) cb).setCliente(nome);
						System.out.printf("Informe  o numero da conta:");
						conta = input.next();
						((ContaPoupanca) cb).setNumeroConta(conta);
						System.out.printf("Informe o saldo da conta:");
						saldo = input.nextDouble();
						BigDecimal aux = new BigDecimal(saldo);
						((ContaPoupanca) cb).setSaldo(aux);
						contas.add(cb);
					}
					else if(tipo.equals("ci")) {
						ContaBancaria cb = new ContaInvestimento();
						System.out.printf("Informe o nome do cliente:");
						nome = input.next();
						((ContaInvestimento) cb).setCliente(nome);
						System.out.printf("Informe  o numero da conta:");
						conta = input.next();
						((ContaInvestimento) cb).setNumeroConta(conta);
						System.out.printf("Informe o saldo da conta:");
						saldo = input.nextDouble();
						BigDecimal aux = new BigDecimal(saldo);
						((ContaInvestimento) cb).setSaldo(aux);
						contas.add(cb);
					}
					break;
				case 2:
						System.out.printf("Informe o numero da conta para poder realizar o saque:");
						conta = input.next();
						for(ContaBancaria c: contas) {
							if(c instanceof ContaCorrente) {
								if(((ContaCorrente) c).getNumeroConta().equals(conta)) {
									System.out.printf("Informe a quantidade do saque:");
									saque = input.nextDouble();
									BigDecimal aux = new BigDecimal(saque);
									c.sacar(aux);
								}
							}
							if(c instanceof ContaInvestimento) {
								if(((ContaInvestimento) c).getNumeroConta().equals(conta)) {		
									System.out.printf("Informe a quantidade do saque:");
									saque = input.nextDouble();
									BigDecimal aux = new BigDecimal(saque);
									c.sacar(aux);
								}
							}
							if(c instanceof ContaPoupanca) {
								if(((ContaPoupanca) c).getNumeroConta().equals(conta)){
									System.out.printf("Informe a quantidade do saque:");
									saque = input.nextDouble();
									BigDecimal aux = new BigDecimal(saque);
									c.sacar(aux);	
								
								}
												
							}
							
						}
					
					break;
				case 3:
					System.out.printf("Informe o numero da conta para poder atualizar o rendimento:");
					conta = input.next();
					for(ContaBancaria c: contas) {
						if(c instanceof ContaPoupanca) {
							if(((ContaPoupanca) c).getNumeroConta().equals(conta)) {
								System.out.printf("Quantidade da taxa:0.2\n");
								BigDecimal aux = new BigDecimal(0.2);
								((ContaPoupanca) c).calcularNovoSaldo(aux);
							}
						}
						if(c instanceof ContaInvestimento) {
							if(((ContaInvestimento) c).getNumeroConta().equals(conta)){
								System.out.printf("Quantidade da taxa:0.2\n");
								BigDecimal aux = new BigDecimal(0.2);
								((ContaInvestimento) c).calcularNovoSaldo(aux);
							}
						}
					}
					
					break;
				case 4:
					System.out.printf("Informe o numero da conta para poder realizar o deposito:");
					conta = input.next();
					for(ContaBancaria c: contas) {
						if(c instanceof ContaCorrente) {
							if(((ContaCorrente) c).getNumeroConta().equals(conta)){
								System.out.printf("Informe a quantidade do deposito:");
								deposito = input.nextDouble();
								BigDecimal aux = new BigDecimal(deposito);
								c.depositar(aux);
							}
						}	
						if(c instanceof ContaPoupanca) {	
							if(((ContaPoupanca) c).getNumeroConta().equals(conta)) {
								System.out.printf("Informe a quantidade do deposito:");
								deposito = input.nextDouble();
								BigDecimal aux = new BigDecimal(deposito);
								c.depositar(aux);
							}
						}	
						if(c instanceof ContaInvestimento) {		
							if(((ContaInvestimento) c).getNumeroConta().equals(conta)){
								System.out.printf("Informe a quantidade do deposito:");
								deposito = input.nextDouble();
								BigDecimal aux = new BigDecimal(deposito);
								c.depositar(aux);
							}
						}
						
					}
					
					break;
				case 5:
					System.out.printf("Informe o numero da conta para poder mostar o saldo:");
					conta = input.next();
					for(ContaBancaria c: contas) {
						if(c instanceof ContaCorrente) {
							if(((ContaCorrente) c).getNumeroConta().equals(conta)){
								System.out.printf("Saldo:%.2f\n",((ContaCorrente) c).getSaldo());
							}
						}
						if(c instanceof ContaPoupanca) {
							if(((ContaPoupanca) c).getNumeroConta().equals(conta)){
								System.out.printf("Saldo:%.2f\n",((ContaPoupanca) c).getSaldo());
							}
						}
						if(c instanceof ContaInvestimento)
							if(((ContaInvestimento) c).getNumeroConta().equals(conta)){
								System.out.printf("Saldo:%.2f\n",((ContaInvestimento) c).getSaldo());
							}
					}
					
					break;
				case 6:
					System.out.printf("Informe o numero da conta para poder calcular o tributo:");
					conta = input.next();
					for(ContaBancaria c: contas) {
						if(c instanceof ContaInvestimento) {
							if(((ContaInvestimento) c).getNumeroConta().equals(conta)){
								System.out.printf("Quantidade da taxa:0.11\n");
								BigDecimal aux = new BigDecimal(0.11);
								System.out.printf("Tributo da conta:%.2f\n",((ContaInvestimento) c).calcularTributo(aux));
								
							}
						}
					}
					
					break;
				case 7:
					System.out.printf("Informe o numero da conta para poder calcular a taxa de administração:");
					conta = input.next();
					for(ContaBancaria c: contas) {
						if(c instanceof ContaInvestimento) {
							if(((ContaInvestimento) c).getNumeroConta().equals(conta)){
								System.out.printf("Quantidade da taxa:0.11\n");
								BigDecimal aux = new BigDecimal(0.11);
								System.out.printf("Taxa de administração da conta:%.2f\n",((ContaInvestimento) c).calcularTaxaAdministracao(aux));
								
							}
						}
					}
					
					break;
				case 0:
					System.out.printf("Menu encerrado.Programa finalizado...\n");
					return;
				default:
					System.out.printf("Opção invalida. Tente novamente.\n");
					break;
			
			}
			
		}while(op!=0);

	}

}
