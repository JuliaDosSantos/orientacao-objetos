package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scanner.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = scanner.nextDouble();
		}
		
		double maiorValor = 0.0;
		int indiceMaiorValor = 0;
		
		for (int i = 0; i < n; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				indiceMaiorValor = i;
			}
		}
		
		System.out.printf("MAIOR VALOR: %.1f%n", maiorValor);
		System.out.println("POSICAO DO MAIOR VALOR: " + indiceMaiorValor);
		
		scanner.close();
	}

}
