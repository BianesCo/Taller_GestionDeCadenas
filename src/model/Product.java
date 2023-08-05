package model;
/**
 * Esta clase optiene y asigna los atributos que llegan del main
 * @author:Bibian Corredor 
 */

public class Product {
	// Atributos 
	private String name;
	private double value;
	private int stock;
	private boolean iva;
	private ETypeProduct eTypeProduct;
	//Atributo statico
	public static final int STOCK_MIN=10;
	
	public Product(String name, double value, int stock, boolean iva, ETypeProduct eTypeProduct) {
		super();
		this.name = name;
		this.value = value;
		this.stock = stock;
		this.iva = iva;
		this.eTypeProduct= eTypeProduct;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setIva(boolean iva) {
		this.iva = iva;
	}
	public void seteTypeProduct(ETypeProduct eTypeProduct) {
		this.eTypeProduct = eTypeProduct; 
	}
	
	
	public String getName() {
		return name;
	}
	public double getValue() {
		return value;
	}
	/**
	 * Metodo que devuelve la cantidad de productos que hay, pero solo si es mayor a la cantidad de productos minimos 
	 */
	public int getStock() { 
		
		if (stock >= STOCK_MIN) {
			return stock;
		}
		return 0;
	}// Cierre de metodo 
	public boolean isIva() {
		return iva;
	}
	public ETypeProduct geteTypeProduct() {
		return eTypeProduct;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", value=" + value + ", stock=" + stock + ", iva=" + iva + "]";
	}


}
