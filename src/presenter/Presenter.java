package presenter;


import model.ETypeProduct;
import model.Product;
import model.ServiceSale;

public class Presenter {
	
	private ServiceSale serviceSale;

	public Presenter() {
	}
	
	
	
	public double addSale(String name, double value, int stock, boolean iva,ETypeProduct eTypeProduct,int cont ) throws Exception {
		
		Product product = new Product(name, value, stock, iva, eTypeProduct);
		
		ServiceSale serviceSale = new ServiceSale(product, cont);
		
		return value;
	}
	public String showSale() {
		
		return "el total de la compra /n"+serviceSale.getSale().getTotalSale()+" total agrabado /n "+ serviceSale.getSale().calcIva() ; 
	}


}
