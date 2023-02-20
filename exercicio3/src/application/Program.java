package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Student student = new Student();
		
		student.nome = scanner.nextLine();
		student.nota1 = scanner.nextDouble();
		student.nota2 = scanner.nextDouble();
		student.nota3 = scanner.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.notaFinal());
		
		if (student.notaFinal() > 60.0) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.pontosFaltantes());
		}
		
		scanner.close();
	}

}
