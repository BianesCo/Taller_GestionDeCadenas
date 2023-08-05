package model;

/*
 * 
 */
public class Sale {
	
	private Product produc;
	private int cont;
	
	public Sale(Product produc, int cont) { 
		this.produc = produc;
		this.cont = cont;
	}
 
	public Product getProduc() {
		return produc;
	}

	public void setProduc(Product produc) {
		this.produc = produc;
	}

	public int getCont() {
		if (cont <= produc.getStock()) {
			return cont;
		}
		return 0;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	/*
	 * metodo que calcula el descuento dependiendo de la cantidad de productos que se compren 
	 * @reture El descuento al o los productos comprados
	 */
	public double calcDiscount() {
		
		double discount=0;
		if (cont<5 && cont>0) {
			discount = 0;
		}else if (cont >=5 && cont <= 10) {
		   discount = (produc.getValue()* cont)*0.05;
			
		}else if (cont>=11 && cont <=20) {
			discount = (produc.getValue()* cont)*0.1;
			
		}else if (cont>=21 && cont<=50) {
			discount=(produc.getValue()*cont)*0.15;
			
		}else if(cont>=50) {
			discount = (produc.getValue()*cont )* 0.3;
		}
		return  discount;
	}// Cierre del metodo
	/*
	 * Método que devuelve el precio total del producto con el descuento y el iva
	 * @reture el precio total del producto
	 */
	public double getTotalSale() {
		return (produc.getValue()* cont)- calcDiscount() + calcIva(); 
	}//Cierre de metodo 
	/*
	 * Método que devuelve el calculo del iva segun los parametros dados
	 * @reture El valor del iva 
	 */
	public double calcIva() {
		
		if (produc.isIva()== true) {
			
			double calIva = switch(produc.geteTypeProduct()) {
			
			case LICORES -> (produc.getValue()* cont)* 0.19;
			
			case VIVERES -> (produc.getValue()* cont) * 0.08;
			
			case MEDICINAS -> produc.getValue()* cont;
			
			case ASEO -> (produc.getValue()* cont) * 0.14;
			
			case RANCHO -> (produc.getValue()* cont)* 0.19;
			
			default -> 0.0; 
			};
			return Math.round(calIva); 
		}
		return 0;
		
	} // Cierre del metodo 
	

}
