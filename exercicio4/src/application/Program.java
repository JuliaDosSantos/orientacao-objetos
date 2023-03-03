package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double depositoInicial = 0;
		
		Conta conta = new Conta();

		System.out.print("Enter account number: ");
		int numeroConta = scanner.nextInt();
		
		System.out.print("Enter account holder: ");
		String nomeTitular = scanner.next();
		
		System.out.print("Is there an initial deposit? ");
		String temDepositoInicial = scanner.next();
		if (temDepositoInicial.equals("y")) {
			System.out.print("Enter initial depoist value: ");
			depositoInicial = scanner.nextDouble();
			conta.addDeposito(depositoInicial);
		}
		else {
			
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.printf("Account " + numeroConta + ", Holder " + nomeTitular + ", Balance $ %.2f.%n", depositoInicial);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valorDeposito = scanner.nextDouble();
		conta.addDeposito(valorDeposito);
		System.out.println("Updated account data: ");
		System.out.printf("Account " + numeroConta + ", Holder" + nomeTitular + ", Balance $ %.2f.%n", conta.getSaldo());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double valorSaque = scanner.nextDouble();
		conta.addSaque(valorSaque);
		System.out.println("Updated account data: ");
		System.out.printf("Account " + numeroConta + ", Holder" + nomeTitular + ", Balance $ %.2f.%n", conta.getSaldo());
		
		scanner.close();
	}

}
