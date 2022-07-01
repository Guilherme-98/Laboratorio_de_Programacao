import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		String pNome, sobrenome;
		int dia, mes, ano;
		HeartRates elementos;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o seu PRIMEIRO nome:");
		pNome = teclado.nextLine();
		System.out.print("Informe o seu SOBRENOME:");
		sobrenome = teclado.nextLine();
		System.out.print("Informe o seu DIA de nascimento:");
		dia = teclado.nextInt();
		System.out.print("Informe o seu MES de nascimento:");
		mes = teclado.nextInt();
		System.out.print("Informe o seu Ano de nascimento:");
		ano = teclado.nextInt();
		
		elementos = new HeartRates(pNome,sobrenome,dia,mes,ano);
		elementos.set();
		elementos.printInformacoes();
		System.out.printf("Idade:%d\n",elementos.getIdade());
		System.out.printf("Frequencia Maxima:%d\n",elementos.getFrequenciaMax());
		System.out.printf("Frequencia ALVO:%.0f - %.0f",elementos.getFrequenciaInicio(),elementos.getFrequenciaFinal());
		teclado.close();
	}
}
