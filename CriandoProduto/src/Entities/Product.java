package Entities;

public class Product {
	private String name;
	private double product;
	private int quantity;
	
	
	public double totalValueInStock() {
		return this.product * this.quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return this.name + ", $" + String.format("%.2f", this.product) + ", " + this.quantity + " quantidade" + totalValueInStock();
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getProduct() {
		return product;
	}
	
	public void setProduct(double product) {
		this.product = product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
