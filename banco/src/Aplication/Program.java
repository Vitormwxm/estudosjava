package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<ContaBancaria> list = new ArrayList<>();
		
		System.out.println("quantos usuários deseja adicionar? ");
		int n = scanner.nextInt();
		
		for(int i=0; i < n; i++ ) {
			System.out.println("numero da conta");
			int numeroConta = scanner.nextInt();
			scanner.nextLine();
			System.out.println("titular da conta ");
			String titularConta = scanner.nextLine();
			
			ContaBancaria contabancaria = new ContaBancaria(numeroConta, titularConta);
			
			list.add(contabancaria);
		}
		
		System.out.println("qual conta bancária deseja acessar? ");
		int idFuncionario = scanner.nextInt();
		Integer pos = position(list, idFuncionario);
		if(pos == null) {
			System.out.println("funcionario não existe ");
		}
		
		ContaBancaria contabancaria = new ContaBancaria();
		System.out.println("seja bem vindo, a taxa de saque do nosso banco é R$ 5,00. " + list.get(pos).getTitularConta() + ", deseja depositar? " );  
		String simNao = scanner.next();
		String queroDepositar = "sim";
		if(simNao.equalsIgnoreCase(queroDepositar)) {
			System.out.println("informe o valor do depósito: " );
			contabancaria.depositar(scanner.nextDouble());
		} else {
			System.out.println("não");
		}
		
		
		int opcao = 0;
		do {
			System.out.println("1: sacar\n2: depositar\n3: sair ");
			opcao = scanner.nextInt();
			
			switch(opcao) {
			 	case 1: 
			 		System.out.println("informe o valor do saque: ");
			 		contabancaria.sacar(scanner.nextDouble());
			 		break;
			 	case 2:
			 		System.out.println("informe o valor do depósito: ");
			 		contabancaria.depositar(scanner.nextDouble());
			 		break;
			 	case 3:
			 		System.out.println("saindo da aplicação");
			 		break;
			}
			
		} while (opcao != 3);
		
		scanner.close();
	}
		public static Integer position(List<ContaBancaria> list, int idFuncionario) {
			for(int i=0; i < list.size(); i++) {
				if(list.get(i).getNumeroConta() == (idFuncionario));
				return i; 
			}
			return null;
		}
	}

