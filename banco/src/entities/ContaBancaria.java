package entities;

public class ContaBancaria {
	private Integer numeroConta;
	private String titularConta;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String titularConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
	}
	
	public ContaBancaria() {
		
	}

	public ContaBancaria(int numeroConta, String titularConta, double saldo) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldo = saldo;
	}
	
	public void depositar(double deposito) {
		this.saldo = this.saldo + deposito;	
		System.out.print("valor depositado: " + deposito + "\nsaldo atual: " + this.saldo + "\n");
	}
	
	public void sacar (double saque) {
		int taxa = 5;
		this.saldo = (this.saldo - taxa) - saque;
		System.out.print("valor sacado: " + saque + "\nsaldo atual: " + this.saldo + "\ntaxa de saque: " + taxa + "\n");
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getTitularConta() {
		return titularConta;
	}
	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
