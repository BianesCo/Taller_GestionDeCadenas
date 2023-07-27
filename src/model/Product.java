package model;

public class Product {
	private String name;
	private double value;
	private int stock;
	private boolean iva;
	public static final int STOCK_MIN=10;
	public Product(String name, double value, int stock, boolean iva) {
		super();
		this.name = name;
		this.value = value;
		this.stock = stock;
		this.iva = iva;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isIva() {
		return iva;
	}
	public void setIva(boolean iva) {
		this.iva = iva;
	}

}
