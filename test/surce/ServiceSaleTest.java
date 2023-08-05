
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

import model.ETypeProduct;
import model.Product;
import model.Sale;
import model.ServiceSale;

public class ServiceSaleTest {
	
	 private ServiceSale serviceSale;
	 
	 Product soap;
	 
	 @BeforeEach
	 void setup() {
		 soap = new Product("jabon rey", 2300,15,true, ETypeProduct.ASEO);
		 
	 }
	  @Test
	  void ServiceSale() {
		  try {
			serviceSale = new ServiceSale(soap, 15);
			Sale sale = serviceSale.getSale();
			assertEquals("jabon rey", serviceSale.getSale().getProduc().getName()); 
			assertEquals(15, soap.getStock());
			assertEquals(15, sale.getCont());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
	
		}
	  } 
	    

}
