package Aplication;

import java.util.Scanner;

import Entities.Funcionario;

public class Program {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		funcionario.name = scanner.nextLine();
		funcionario.grossSalary = scanner.nextDouble();
		funcionario.tax = scanner.nextDouble();
		System.out.println(funcionario.NetSalary());
		funcionario.IncreaseSalaray(50);
		System.out.println(funcionario);
	}
}
