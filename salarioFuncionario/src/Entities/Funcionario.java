package Entities;

public class Funcionario {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalaray(double porcentagem) {
		double porcentagemConvertida = porcentagem / 100;
		double result = this.grossSalary * porcentagemConvertida;
		this.grossSalary += result;
	}
	
	public String toString() {
		return name + " , " + grossSalary + " , " + tax;
	}
}
