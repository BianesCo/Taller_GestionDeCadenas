package model;

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
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public double calcDiscount() {
		
		double discount=0;
		if (cont<5 && cont>0) {
			return	produc.getValue();
		}else if (cont >=5 && cont <= 10) {
		   discount = (produc.getValue()* cont)*0.05;
			
		}else if (cont>=11 && cont <=20) {
			discount = (produc.getValue()* cont)*0.1;
			
		}else if (cont>=21 && cont<=50) {
			discount=(produc.getValue()*cont)*0.15;
			
		}else if(cont>=50) {
			discount = (produc.getValue()*cont )* 0.3;
		}
		return (produc.getValue()*cont)- discount;
	}
	public double getTotalSale() {
		
		return (int)(calcDiscount()+calcIva());
	}
	
	public double calcIva() {
		
		if (produc.isIva()== true) {
			
			double calIva = switch(produc.geteTypeProduct()) {
			
			case LICORES -> calcDiscount() * 0.19;
			
			case VIVERES -> calcDiscount() * 0.08;
			
			case MEDICINAS -> calcDiscount();
			
			case ASEO -> calcDiscount() * 0.14;
			
			case RANCHO -> calcDiscount() * 0.19;
			
			default -> 0.0;
			};
			return calIva;
		}
		return 0;
		
	} 
	

}
