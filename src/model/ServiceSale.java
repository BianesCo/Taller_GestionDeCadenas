package model;

public class ServiceSale {

	private Sale sale;

	public ServiceSale(Product product, int cont) throws Exception {
		if (cont > product.getStock()) { 
			
			this.sale = new Sale(product, cont); 
		}
		this.sale = new Sale(product, cont);
				
	
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

} 
