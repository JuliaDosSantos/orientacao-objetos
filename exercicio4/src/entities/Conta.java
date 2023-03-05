package entities;

public class Conta {
	
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public Conta(){
	}
	
	public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		addDeposito(depositoInicial);
	}
	
	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void addDeposito(double valor) {
		saldo += valor;
	}
	
	public void addSaque(double valor) {
		saldo -= valor + 5.00;
	}
	
	public String toString() {
		return "Conta "
				+ numeroConta
				+ ", Holder: "
				+ nomeTitular
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
				
	}
}
