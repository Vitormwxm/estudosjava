package matrizesexercicio;

import java.util.Scanner;

public class MatrizExercicion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		// m = colunas
		// n = linhas 
		int[][] mat = new int[m][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
		
		
		int position = scanner.nextInt();
		
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(position == mat[i][j]) {
					System.out.println("position: " + mat[i][j]);
					if( j > 0) {
						System.out.println("left: " + mat[i][j - 1]);
					}
					
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					
					if( j < mat.length -1) {
						System.out.println("right: " + mat[i][j+1]);
					}
					
					if(i < mat.length -1) {
						System.out.println("Up: " + mat[i+1][j]);
					}
				}
			}
		}
		

	}

}
