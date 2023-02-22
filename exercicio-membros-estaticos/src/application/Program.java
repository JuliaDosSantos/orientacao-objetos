package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double cotacao = scanner.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double quantDolares = scanner.nextDouble();
		
		System.out.println("Amount to be paid in reais");
		
		System.out.printf("%.2f%n", CurrencyConverter.valorFinal(cotacao, quantDolares));

	}

}
