package Aplication;

import entities.Retangulo;

public class CalcularRetangulo {
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		
		retangulo.setAltura(5);
		retangulo.setLargura(12);
	
		System.out.println(retangulo.diagonal());
		
	}
}
