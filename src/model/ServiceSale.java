package model;

public class ServiceSale {
	
	
	private Sale Sale;
	
	public ServiceSale(Product produc, int cont) throws Exception {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("error",e);
		}
		
	}

	public Sale getSale() {
		return Sale;
	}

	public void setSale(Sale sale) {
		Sale = sale;
	}
	
 
}
