package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = scanner.nextLine();
		
		System.out.println("Gross Salary: ");
		employee.grossSalary = scanner.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = scanner.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.println("Wich percentage to increase salary?");
		double percentage = scanner.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update Employee: " + employee);
		
		scanner.close();
	}

}
