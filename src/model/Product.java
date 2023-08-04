package model;

public class Product {
	
	private String name;
	private double value;
	private int stock;
	private boolean iva;
	public static final int STOCK_MIN=10;
	private ETypeProduct eTypeProduct;
	
	
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
	public int getStock() {
		
		if (stock >= STOCK_MIN) {
			return stock;
		}
		return 0;
	}
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
