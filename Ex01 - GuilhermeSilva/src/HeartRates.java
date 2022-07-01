
public class HeartRates{
	private String pNome,sobrenome;
	private int dia, mes, ano, idade,frequenciaMax;
	private double frequenciaInicio, frequenciaFinal;
	
	public HeartRates(String pNome, String sobrenome, int dia, int mes, int ano) {
		this.pNome = pNome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.idade = 0;
	}
	public void set(){
		this.idade = 2020 - ano; 
		this.frequenciaMax = 220 - idade;
		this.frequenciaInicio = frequenciaMax * 0.5;
		this.frequenciaFinal = frequenciaMax * 0.85;	
	}	
	public void printInformacoes (){
		System.out.printf("Nome:%s\nSobrenome:%s\n",pNome,sobrenome);
		System.out.printf("Data de nascimento:%d/%d/%d\n",dia,mes,ano);
	}
	public int getIdade(){
		return idade;
	}
	public int getFrequenciaMax(){
		return frequenciaMax;
	}
	public double getFrequenciaInicio(){
		return frequenciaInicio;
	}
	public double getFrequenciaFinal(){
		return frequenciaFinal;
	}
}
