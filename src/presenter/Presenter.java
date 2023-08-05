package presenter;


import model.ETypeProduct;
import model.Product;
import model.ServiceSale;

public class Presenter {
	
	private ServiceSale serviceSale; 

	public Presenter() {
	
	}
	/*
	 * Metodo que devuelve el precio del producto 
	 * @param name,value,stock,iva,eTypeProduct y cont son parametros definen las caracteristicas del producto 
	 * @return el precio total del producto 
	 */
	public double addSale(String name, double value, int stock, boolean iva,ETypeProduct eTypeProduct,int cont ){
		try { 
			this.serviceSale = new ServiceSale(new Product(name, value, stock, iva, eTypeProduct), cont);
			return serviceSale.getSale().getTotalSale();	 
		} catch (Exception e) {
			e.getLocalizedMessage();
			return 0.0; 
		}
	}// Cierre del metodo
	/*
	 * Metodo que devuelve el total de la compra, el iva y el descuento de la compra 
	 * @return una cadena de texto con el precio,iva y descuento de la compra 
	 */
	public String showSale() {
		
		return "total: "+serviceSale.getSale().getTotalSale()+"\n iva: "+ serviceSale.getSale().calcIva() + "\n descuento: "+ serviceSale.getSale().calcDiscount() ; 
	}// Cierre del metodo 

	public ServiceSale getServiceSale() { 
		
		return serviceSale;
	}



	public void setServiceSale(ServiceSale serviceSale) {
		this.serviceSale = serviceSale; 
	}
}