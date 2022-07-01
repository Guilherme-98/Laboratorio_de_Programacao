
import java.util.LinkedList;
import java.util.Random;

public class ContaCorrente {
	private String cliente;
	private double saldo;
	public static LinkedList<ContaCorrente> contas;
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	public void depositar(double valor) {
		this.saldo += valor;
	}
}
