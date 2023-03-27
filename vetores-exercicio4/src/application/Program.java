package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scanner.nextInt();
		int [] vetor = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = scanner.nextInt();
		}
		
		System.out.print("Numeros pares: ");
		
		int contagemPares = 0;
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				contagemPares += 1;
			}
		}
		
		System.out.print("\nQuantidade de pares: ");
		System.out.println(contagemPares);
		
		scanner.close();
		
	}
	
}
