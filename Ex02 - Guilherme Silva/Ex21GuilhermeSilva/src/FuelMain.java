import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class FuelMain {

	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
	int op, id, typeC = 0, idinput;
	String nameC, fuelUsed;
	boolean empty = true;
	BigDecimal pL,liters, money, result;
	
	LinkedList<Pump> pumpList = new LinkedList<Pump>();
	
		while(true){
			System.out.printf("***********************************************\n");
			System.out.printf("* 0 - Sair do programa                        *\n");
			System.out.printf("* 1 - Cadastrar uma nova bomba de combustivel *\n");
			System.out.printf("* 2 - Abastecer em dinheiro                   *\n");
			System.out.printf("* 3 - Abastecer em litros                     *\n");
			System.out.printf("***********************************************\n");
			System.out.printf("Selecione uma opção: ");
			op = input.nextInt();
				switch(op){
					case 0: {
						System.out.printf("Programa encerrado.\n");
						return;
					}
					case 1:
						Pump pump = new Pump();
						empty = false;
						System.out.printf("Informa o ID da bomba: ");
						id = input.nextInt();
						pump.getId();
						pump.setId(id);
						System.out.printf("Quantidade de tipos de combustiveis na bomba criada: ");
						typeC = input.nextInt();
						if(typeC <= 0) {
							System.out.println("Pelo menos 1 combustivel deve ser cadastrado!!");
						}
						else {
							for(int i=0; i<typeC; i++) {
								Combustivel comb1 = new Combustivel();
								System.out.printf("Informe o nome do combustivel%d:",i+1);
								nameC = input.next();
								System.out.printf("Informe o preço do combustivel%d:",i+1);
								pL = input.nextBigDecimal();
								comb1.setType(nameC);
								comb1.setPrice(pL);
								pump.setComb(comb1);
								pumpList.add(pump);
							}
						}
						break;
					case 2:
						if(empty == true) {
							System.out.printf("Cadastre uma bomba de combustivel primeiro.\n");
							break;
						}
						System.out.printf("Informe o ID da bomba: ");
						for(int i=0; i<pumpList.size(); i++) {
							System.out.printf("ID da bomba:%d\n", pumpList.get(i).getId());
						}
						idinput = input.nextInt();
						Pump pumpInput = null;
						for(int i=0; i<pumpList.size(); i++) {
							if(pumpList.get(i).getId() == idinput) {
								pumpInput = pumpList.get(i); 
								break;
							}
						}
						if(pumpInput == null){
							System.out.printf("Bomba não foi encontrado.\n");
						}
						else {
							for(int i=0; i<pumpInput.getComb().size(); i++) {
								System.out.printf("Tipo do combustivel:%s\n", pumpInput.getComb().get(i).getType());
							}
							System.out.printf("Informe o nome do combustivel: ");
							fuelUsed = input.next();
							System.out.printf("Informe a quantidade de dinheiro: ");
							money = input.nextBigDecimal();
							Combustivel fuelInput = null;
							for(int i=0; i<pumpInput.getComb().size(); i++) {
								if(pumpInput.getComb().get(i).getType().equals(fuelUsed)) {
									fuelInput = pumpInput.getComb().get(i);
									break;
								}
							}
							if(fuelInput == null){
								System.out.printf("Combustivel não encontrado.\n");
							}
							else {
								result = money.divide(fuelInput.getPrice());
								System.out.printf("Foram abastecido:%.2f\n", result);
							}
							
						}
						break;
					case 3:
						if(empty == true) {
							System.out.printf("Cadastre uma bomba de combustivel primeiro.\n");
							break;
						}
						System.out.printf("Informe o ID da bomba:\n");
						for(int i=0; i<pumpList.size(); i++) {
							System.out.printf("ID da bomba:%d\n", pumpList.get(i).getId());
						}
						idinput = input.nextInt();
						pumpInput = null;
						for(int i=0; i<pumpList.size(); i++) {
							if(pumpList.get(i).getId() == idinput) {
								pumpInput = pumpList.get(i); 
								break;
							}
						}
						if(pumpInput == null){
							System.out.printf("Bomba não foi encontrado.\n");
						}
						else {
							for(int i=0; i<pumpInput.getComb().size(); i++) {
								System.out.printf("Tipo do combustivel:%s\n", pumpInput.getComb().get(i).getType());
							}
							System.out.printf("Informe o nome do combustivel: ");
							fuelUsed = input.next();
							System.out.printf("Informe a quantidade em litro: ");
							liters = input.nextBigDecimal();
							Combustivel fuelInput = null;
							for(int i=0; i<pumpInput.getComb().size(); i++) {
								if(pumpInput.getComb().get(i).getType().equals(fuelUsed)) {
									fuelInput = pumpInput.getComb().get(i);
									break;
								}
							}
							if(fuelInput == null){
								System.out.printf("Combustivel não encontrado.\n");
							}
							else {
								result = liters.multiply(fuelInput.getPrice());
								System.out.printf("O total do abastecimento:%.2f\n", result);
							}
						}
						break;	
				}
			}
		}
	}
