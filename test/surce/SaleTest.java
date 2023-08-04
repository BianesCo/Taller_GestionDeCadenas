import static org.junit.jupiter.api.Assertions.*;
 


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.ETypeProduct;
import model.Product;
import model.Sale;
import model.ServiceSale;
import presenter.Presenter;

class SaleTest {

private Sale sale;

	
	Product soap;
	Product rice;
	Product whisky;
	Product pancake; 

	@BeforeEach
	void setup() {
		 soap= new Product("jabon Rey", 2300, 30, true, ETypeProduct.ASEO);
		 rice = new Product("Arroz lv", 4600, 80, false, ETypeProduct.VIVERES);
		 whisky = new Product("Old Par x Lt", 180000, 18, true, ETypeProduct.LICORES);
		 pancake = new Product("Pancake", 1500, 342, false, ETypeProduct.RANCHO); 
	}

	@Test
	void CalcDiscount() {
		sale = new Sale(soap, 10);
		assertEquals(1150.0, sale.calcDiscount(),0.1); 
		
	}

	@Test
	void GetTotalSale() {
		sale = new Sale(soap, 10);
		assertEquals(25070.0, sale.getTotalSale(),0.1);
		
	}

	@Test
	void CalcIva() {
		sale = new Sale(soap, 10);
		assertEquals(3220.0, sale.calcIva(),0.1);
	}


	}

