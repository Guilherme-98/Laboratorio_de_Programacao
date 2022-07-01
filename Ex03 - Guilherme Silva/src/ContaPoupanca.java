import java.math.BigDecimal;

public class ContaPoupanca implements ContaBancaria {
	
	private String cliente;
	private String numeroConta;
	private BigDecimal saldo;
	
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
	

	@Override
	public void sacar(BigDecimal valor) {
		if(valor.compareTo(BigDecimal.ZERO) >=  0) {
			if(this.getSaldo().compareTo(valor) == 1) {	
				this.setSaldo(this.getSaldo().subtract(valor));
				System.out.printf("Saque realizado com sucesso.\n");
			}else {
				System.out.printf("Impossivel realizar a operação de saque. Saldo insuficiente\n");
			}
		}else {
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
	
	public void calcularNovoSaldo(BigDecimal taxa) {
		BigDecimal aux;
		aux = this.getSaldo().multiply(taxa);
		this.setSaldo(this.getSaldo().add(aux));
		System.out.printf("Saldo atualizado com sucesso.\n");
	}
}
