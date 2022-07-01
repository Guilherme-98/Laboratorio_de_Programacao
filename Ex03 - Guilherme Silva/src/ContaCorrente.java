import java.math.BigDecimal;

public class ContaCorrente implements ContaBancaria {
	
	private String cliente;
	private String numeroConta;
	private BigDecimal saldo;
	private BigDecimal limite;
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public BigDecimal getSaldo() {
		return saldo;
	}
	
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	public BigDecimal getLimite() {
		return limite;
	}
	
	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}


	@Override
	public void sacar(BigDecimal valor) {
		if(valor.compareTo(BigDecimal.ZERO) <=  0) {
			System.out.printf("Valor do saque incorreto.\n");
		}
		if(this.getSaldo().compareTo(valor) == 1) {	
			this.setSaldo(this.getSaldo().subtract(valor));
			System.out.printf("Saque realizado com sucesso, sem alteração no limite.\n");
		}
		else if(this.getSaldo().add(this.getLimite()).compareTo(valor) >= 0) {
			BigDecimal aux;
			BigDecimal aux2 = new BigDecimal(0);
			aux = valor.subtract(this.getSaldo());
			this.setLimite(this.getLimite().subtract(aux));
			this.setSaldo(aux2);
			System.out.printf("Saque realiazado com sucesso, com aletração no limite.\n");
		}
		else {
			System.out.printf("Impossivel realizar a operação de saque.\n");
		}
	
		
	}

	@Override
	public void depositar(BigDecimal valor) {
		if(valor.signum() >0) {
			this.setSaldo(this.getSaldo().add(valor));
			System.out.printf("Deposito realizado com sucesso.\n");
		}else {
			System.out.printf("Valor do deposito incorreto.\n");
		}
		
	}
}
