package persionato;

import java.util.Scanner;

import salas.Aluguel;

public class Persionato {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Aluguel[] quartos = new Aluguel[10];
		System.out.println("quantos quartos deseja alugar?: ");
		int n = scanner.nextInt();
		
		for(int i=0; i < n; i++) {
			System.out.println("quarto #" + i );
			System.out.print("digite seu nome: ");
			String nome = scanner.next();
			System.out.print("digite seu email: ");
			String email = scanner.next();
			System.out.print("escolha um quarto: ");
			int roomNumber = scanner.nextInt();
			
			quartos[roomNumber] = new Aluguel(nome, email);
		}
		
		for(int i= 0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(quartos[i]);
			}
			
		}
	}
}
