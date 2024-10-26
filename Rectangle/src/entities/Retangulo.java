package entities;

public class Retangulo {
	private double largura;
	private double altura;
	
	
	public double area() {
		return this.largura * this.altura;
	}
	
	public double perimetro() {
		return this.largura * 2 + this.altura * 2;
	}
	
	public double diagonal() {
		double d;
		
		d = (this.largura * this.largura) + (this.altura * this.altura);
		return Math.sqrt(d);
	}
	
	public String toString() {
		return "perimetro: " + perimetro() + " area: " + area() + " diagonal " + diagonal();
	}
	
	public double getLargura() {
		return this.largura;
	}
	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
