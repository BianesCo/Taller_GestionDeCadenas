package presenter;


import model.ETypeProduct;
import model.Product;
import model.ServiceSale;

public class Presenter {
	
	private ServiceSale serviceSale; 

	public Presenter() {
	
	}

	public double addSale(String name, double value, int stock, boolean iva,ETypeProduct eTypeProduct,int cont ){
		try { 
			this.serviceSale = new ServiceSale(new Product(name, value, stock, iva, eTypeProduct), cont);
			return serviceSale.getSale().getTotalSale();	 
		} catch (Exception e) {
			e.getLocalizedMessage();
			return 0.0; 
		}
	}
	public String showSale() {
		
		return "total: "+serviceSale.getSale().getTotalSale()+"\n iva: "+ serviceSale.getSale().calcIva() + "\n descuento: "+ serviceSale.getSale().calcDiscount() ; 
	}

	public ServiceSale getServiceSale() { 
		
		return serviceSale;
	}



	public void setServiceSale(ServiceSale serviceSale) {
		this.serviceSale = serviceSale;
	}
}