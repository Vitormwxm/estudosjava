package vetores;

import java.lang.reflect.Field;
import java.util.Scanner;
import pessoa.Pessoa;

public class AulaVetor {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("quantas pessoas serão digitadas? ");
		int numeros = scanner.nextInt();
		String[] nome = new String[numeros];
		double[] altura = new double[numeros];
		int[] idade = new int [numeros];
		String[] nomes = new String[numeros];
		
		double sumAltura = 0;
		int sumIdade = 0;
		double percentualMenores16 = 0;
		for(int i=0; i < numeros; i++) {
			System.out.print("digite o nome: ");
			nome[i] = scanner.next();
			System.out.print("digite a altura: ");
			altura[i] = scanner.nextDouble();
			System.out.print("digite a idade: ");
			idade[i] = scanner.nextInt();
			
			sumAltura = sumAltura + altura[i];
			sumIdade = sumIdade + idade[i];
			
			if(idade[i] < 16) {
				percentualMenores16 = percentualMenores16 + ((idade[i]+1) - idade[i]);
				nomes[i] = nome[i];
			}
			
		
			if(i >= numeros -1) {
				double alturaMedia;
				double idadeMedia;
				alturaMedia =  (double)sumAltura / (double)numeros;
				System.out.print("altura média: " + alturaMedia);
				idadeMedia =  (double)sumIdade / (double)numeros;
				System.out.println("\nidade média: " + idadeMedia );
			}
			
			if(i >=numeros -1) {
				double resultado = (percentualMenores16 * 100) / (double) numeros;
				System.out.print("pessoas com menos de 16 anos: " + resultado + "% \n");
				for(int y= 0; y < nomes.length; y ++) {
					if(nomes[y] == null) {
						nomes[y] = "";
					}
					System.out.println(nomes[y]);
				}
			}
			
			
		}
		
		
		
		
		

		
	}


}
