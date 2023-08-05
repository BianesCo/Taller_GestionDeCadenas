import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.ETypeProduct;
import presenter.Presenter;

public class PresenterTest {

	private Presenter presenter;

	@BeforeEach
	void setup() {
		presenter = new Presenter();
		
	}
	
	@Test 
	void ShowSale() {
		presenter.addSale("jabon rey", 2300, 10, true, ETypeProduct.ASEO, 10); 
		assertEquals(String.format("total: 25070.0 ","iva: 3220.0 ", "descuento 1150.0"), presenter.showSale());	
	    
	}
	
	@Test
	void AddSale() {
		
		assertEquals(47840.0, presenter.addSale("jabon rey", 2300, 20, true, ETypeProduct.ASEO, 20),0.1); 
		
		 
	}
}
 