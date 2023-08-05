package model;

public class ServiceSale {

	private Sale sale;
	/*
	 * contructor que valida la cantidad de productos que da el cliente con la cantidad de productos que hay segun el tipo de producto 
	 */

	public ServiceSale(Product product, int cont) throws Exception {
		if (cont > product.getStock()) { 
			throw new Exception(" productos insuficientes");
		}else if (cont < 0) {
			
			throw new Exception(" productos insuficientes");
		}
		this.sale = new Sale(product, cont);		
	
	}//Cierre del constructor 

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

} 
