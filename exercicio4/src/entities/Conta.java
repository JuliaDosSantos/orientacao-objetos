package entities;

public class Conta {
	
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public Conta(){
	}
	
	public Conta(int numeroConta, String nomeTitular, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
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
		saldo = saldo - valor - 5.00;
	}

}
