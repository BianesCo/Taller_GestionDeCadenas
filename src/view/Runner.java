package view;

import java.util.Scanner;

import model.ETypeProduct;
import model.Product;
import model.ServiceSale;
import presenter.Presenter;

public class Runner {

	private Presenter presenter;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		Scanner string = new Scanner(System.in);
		
		Presenter presenter = new Presenter();
		double contTotalValue = 0;

		byte optionTwo=0;
		  
		Product soap;
		Product rice;
		Product whisky;
		Product pancake;
		Product medicine;
		
		 soap= new Product("jabon de baño", 2300, 30, true, ETypeProduct.ASEO);
		 rice = new Product("Arroz ", 4600, 80, false, ETypeProduct.VIVERES);
		 whisky = new Product("Jack Daniels", 200000, 20, true, ETypeProduct.LICORES);
		 pancake = new Product("Pancake", 1500,60, false, ETypeProduct.RANCHO);
		 medicine = new Product("ibuprofeno",2000,50,false,ETypeProduct.MEDICINAS);
		 
		 String optionThree= "k";
		 
		 System.out.println(" BIENVENIDOS A LA TIENDA \n ");
		 
		 do {
			System.out.println(" NUESTROS PRODUCTOS SON : \n" 
						+ " 1. jabon de baño \n"
						+ " 2. arroz \n"
						+ " 3. Jack Daniels \n"
						+ " 4. Pancake \n" 
						+ " 5. ibuprofeno \n"
						+ " 6. ninguna de las anteriores \n");
			 byte option = input.nextByte();
				 
				 switch (option) {
				case 1 :
					System.out.println("¿cuantos jabones quiere llevar? ");
				    optionTwo = input.nextByte();
					presenter.addSale(soap.getName(),soap.getValue(),soap.getStock(),soap.isIva(),soap.geteTypeProduct(),optionTwo);
					
					break;
				case 2 :
					System.out.println("¿cuantas libras de arroz quiere llevar? ");
					 optionTwo = input.nextByte();
					presenter.addSale(rice.getName(),rice.getValue(),rice.getStock(),rice.isIva(),rice.geteTypeProduct(),optionTwo);
				
					 break;
					 
				case 3 :
					System.out.println("¿cuantas botellas de Jack Daniels  quiere llevar? ");
					 optionTwo = input.nextByte();
					 presenter.addSale(whisky.getName(),whisky.getValue(),whisky.getStock(), whisky.isIva(),whisky.geteTypeProduct(),optionTwo);
					
					 break;
					 
				case 4 :
					System.out.println("¿cuantas bolsas de Pancake quiere llevar? ");
					 optionTwo = input.nextByte();
					presenter.addSale(pancake.getName(),pancake.getValue(), pancake.getStock(), pancake.isIva(),pancake.geteTypeProduct(),optionTwo);
					
					 break;
				case 5 :
					System.out.println("¿cuantos ibuprofeno quiere llevar? ");
					 optionTwo = input.nextByte();
					presenter.addSale(medicine.getName(),medicine.getValue(),medicine.getStock(),medicine.isIva(),medicine.geteTypeProduct(),optionTwo);
					
					break;
					
				case 6 :
					System.out.println("lo siento no tenemos mas productos, quisas a la proxima \n");
					optionThree = "m";
							
					
					break;
				}
				 
		         System.out.println(" \n¿desea algun otro producto? \n"
				 		             + "digite k para si o m para no");
		   
		            optionThree = string.nextLine();
		           
		           
		          
		          contTotalValue +=presenter.getServiceSale().getSale().getTotalSale();
		          
		} while (optionThree.equals("k"));
		
		 System.out.println("gracias por su compra \n\n"
         		+ "    FACTURA     \n"+ presenter.showSale()+ "\n total de las compras"+contTotalValue);
		
		System.out.println(" hoal laosm");
		

	}

}
