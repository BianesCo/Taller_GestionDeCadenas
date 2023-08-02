package presenter;


import model.ETypeProduct;
import model.ServiceSale;

public class Presenter {
	
	private ServiceSale serviceSale;

	public Presenter() {
	}
	
	public double addSale(String name, double value, int stock, boolean iva,ETypeProduct eTypeProduct,int cont ) {
//		if(eTypeProduct == true ) {
//			return 1.0;
//		}
	
		return 0.0;
	}
	public String showSale() {
		
		return "el total de la compra /n"+serviceSale.getSale().getTotalSale()+" total agrabado /n "+ serviceSale.getSale().calcIva() ; 
	}
	

}
