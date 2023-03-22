package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		int idade;
		double altura;
		double soma = 0.0;
		int pessoasMenosDezesseis = 0;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		
		int n = scanner.nextInt();
		double[] vect = new double [n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + " pessoa");
			scanner.nextLine();
			System.out.print("Nome: ");
			nome = scanner.nextLine();
			System.out.print("Idade: ");
			idade = scanner.nextInt();
			System.out.print("Altura: ");
			altura = scanner.nextDouble();
			soma += altura;
			if (idade < 16) {
				pessoasMenosDezesseis += 1;
			}
		}
		 
		double mediaAltura = soma / n;
		double porcentagemMenosDezesseis = pessoasMenosDezesseis / n * 100;
		
		System.out.printf("Altura média: %.2f%n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenosDezesseis);
		
		
		scanner.close();

	}

}
