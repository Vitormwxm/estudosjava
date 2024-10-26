package Application;

import java.util.Scanner;

import Entities.Product;

public class Program {
	public static void main (String[] args) {
		Product product = new Product();
		Scanner scanner = new Scanner(System.in);
		
		
		product.setName(scanner.nextLine());
		product.setQuantity(scanner.nextInt());
		product.setProduct(scanner.nextDouble());
		int numero = 0;
		do{
			
			System.out.println("adicionar produto: 1");
			System.out.println("remover produto: 2");
			System.out.println("sair da aplicação: 3");
			System.out.println("digite um numero");
			numero = scanner.nextInt();
			
			switch(numero) {
			case 1:
				System.out.print("adicione a quantidade: ");
				product.addProducts(scanner.nextInt());
				break;
			case 2:
				System.out.print("remova a quantidade: ");
				product.removeProducts(scanner.nextInt());
				break;
			case 3:
				System.out.print("saindo...");
				break;
			}
			
		} while (numero != 3);
		
		System.out.print(product);
		scanner.close();
	}
}
