package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		
		int n = scanner.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = scanner.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0; i <n; i++) {
			soma += vect[i];	
		}
		
		double media = soma / n;
		
		System.out.print("VALORES = ");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vect[i]);
	    }

	
		System.out.printf("\nSOMA: %.2f%n", soma);
		System.out.printf("MEDIA: %.2f%n", media);
		
		scanner.close();
	}

}
