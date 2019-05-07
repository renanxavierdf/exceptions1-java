package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Company;
import entidades.Individual;
import entidades.TaxPayer;

public class Programcontribuinte {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);

			if (ch == 'i') {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income:");
				Double anualIncome = sc.nextDouble();
				System.out.print("Health expenditures:");
				Double healthExpenditures = sc.nextDouble();

				list.add(new Individual(name, anualIncome, healthExpenditures));

			} else if (ch == 'c') {
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income:");
				Double anualIncome = sc.nextDouble();
				System.out.print("Number of employees:");
				Integer numEmployees = sc.nextInt();

				list.add(new Company(name, anualIncome, numEmployees));

			}
		}

		System.out.println("TAXES PAID: ");

		double sum = 0;
		for (TaxPayer tax : list) {
			System.out.println();
			sum += tax.tax();
			System.out.printf("%s : $ %.2f", tax.getName(), tax.tax());
		}
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		sc.close();
	}

}
