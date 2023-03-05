package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double depositoInicial = 0;
		
		Conta conta;

		System.out.print("Enter account number: ");
		int numeroConta = scanner.nextInt();
		
		System.out.print("Enter account holder: ");
		scanner.nextLine();
		String nomeTitular = scanner.nextLine();
		
		System.out.print("Is there an initial deposit? ");
		char temDepositoInicial = scanner.next().charAt(0);
		if (temDepositoInicial == 'y') {
			System.out.print("Enter initial depoist value: ");
			depositoInicial = scanner.nextDouble();
			conta = new Conta(numeroConta, nomeTitular, depositoInicial);
		}
		else {
			conta = new Conta(numeroConta, nomeTitular);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valorDeposito = scanner.nextDouble();
		conta.addDeposito(valorDeposito);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double valorSaque = scanner.nextDouble();
		conta.addSaque(valorSaque);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		scanner.close();
	}

}
