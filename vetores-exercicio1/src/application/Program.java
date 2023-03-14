package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos números voce vai digitar?");
		
		int n = scanner.nextInt();
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = scanner.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS: ");
		
		for (int i=0; i<n; i++) {
			 if (vect[i] < 0) {
				 System.out.printf("%d\n", vect[i]);
			 }
		}
	
		
		
		
		scanner.close();

	}

}
