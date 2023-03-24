package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = scanner.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + " pessoa");
			scanner.nextLine();
			System.out.print("Nome: ");
			nome[i] = scanner.next();
			System.out.print("Idade: ");
			idade[i] = scanner.nextInt();
			System.out.print("Altura: ");
			altura[i] = scanner.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += altura[i];
		}
		
		double mediaAltura = soma / n;
		
		System.out.printf("Altura média: %.2f%n", mediaAltura);
		
		int cont = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				cont = cont + 1;
			}
		}
			
		double porcentagemMenosDezesseis = cont * 100.0 / n;

		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenosDezesseis);
		
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
			
		scanner.close();
		
	}
}
