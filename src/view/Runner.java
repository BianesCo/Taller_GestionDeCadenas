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
		String optionThree= "k";
		double counterTotalValue = 0;
		int numberShopping=0;
		int counterCont=0;
		byte optionTwo=0;
		
		Presenter presenter = new Presenter();
		  
		Product soap;
		Product rice;
		Product whisky;
		Product pancake;
		Product medicine;
		
		 soap= new Product("bath soap", 2300, 30, true, ETypeProduct.ASEO);
		 rice = new Product("Diana rice ", 4600, 80, false, ETypeProduct.VIVERES);
		 whisky = new Product("Jack Daniels", 200000, 20, true, ETypeProduct.LICORES);
		 pancake = new Product("Pancake", 1500,60, false, ETypeProduct.RANCHO);
		 medicine = new Product("ibuprofeno",2000,50,false,ETypeProduct.MEDICINAS);
		 
		do {
          System.out.println(" \n\n WELCOME TO THE GROCERY STORE \n ");
			 try {
				 do {
						System.out.println("  WE OFFER YOU: \n" 
									+ " 1. Bath soap \n"
									+ " 2. Diana rice \n"
									+ " 3. Jack Daniels \n"
									+ " 4. Pancake \n" 
									+ " 5. ibuprofeno \n"
									+ " 6. None of the above \n"
									+ " PLEASE TYPE AN OPTION");
						 byte option = input.nextByte();
						 switch (option) {
							case 1 :
								System.out.println(" How many "+soap.getName()+" do you want to take? ");
							    optionTwo = input.nextByte();
								presenter.addSale(soap.getName(),soap.getValue(),soap.getStock(),soap.isIva(),soap.geteTypeProduct(),optionTwo);
								System.out.println(" Successful sale \n "+ presenter.showSale());
								counterCont=(soap.getStock()- option);
								
								break;
							case 2 :
								System.out.println(" How many pounds of "+rice.getName()+" do you want to take? ");
								 optionTwo = input.nextByte();
								presenter.addSale(rice.getName(),rice.getValue(),rice.getStock(),rice.isIva(),rice.geteTypeProduct(),optionTwo);
								System.out.println("  Successful sale \n "+ presenter.showSale());
								counterCont=(rice.getStock()- optionTwo);
							
								 break;
								 
							case 3 :
								System.out.println(" How many bottles "+whisky.getName()+" do you want to take? ");
								 optionTwo = input.nextByte();
								 presenter.addSale(whisky.getName(),whisky.getValue(),whisky.getStock(), whisky.isIva(),whisky.geteTypeProduct(),optionTwo);
								 System.out.println("  Successful sale \n "+ presenter.showSale());
								 counterCont=(whisky.getStock()- option);
								 break;
								 
							case 4 :
								System.out.println(" How many "+pancake.getName()+" bags do you want to take? ");
								 optionTwo = input.nextByte();
								presenter.addSale(pancake.getName(),pancake.getValue(), pancake.getStock(), pancake.isIva(),pancake.geteTypeProduct(),optionTwo);
								System.out.println("  Successful sale \n "+ presenter.showSale());
								counterCont= (pancake.getStock()-optionTwo);
								 break;
							case 5 :
								System.out.println(" How many "+ medicine.getName()+" do you want to take? ");
								 optionTwo = input.nextByte();
								presenter.addSale(medicine.getName(),medicine.getValue(),medicine.getStock(),medicine.isIva(),medicine.geteTypeProduct(),optionTwo);
								System.out.println("  Successful sale \n "+ presenter.showSale());
								counterCont = (medicine.getStock()-option);
								break;
								
							case 6 :
								System.out.println("I'm sorry we don't have more products\n maybe next time \n");
								optionThree = "m";
								break;
							default:
								input.close();
							}
							 
					         System.out.println(" \n Do you want any other product? \n"
							 		             + " type k for yes or m for no ");
					   
					            optionThree = string.nextLine();
					           
					           
					          numberShopping++;
					          counterTotalValue +=presenter.getServiceSale().getSale().getTotalSale();
					          
					} while (optionThree.equals("k"));
				 
				 double average = counterTotalValue/numberShopping;
				 
				 System.out.println("\n\n Thanks for your shopping \n"
		         		+ "\n Shopping total: "+counterTotalValue+"\n Average:"+ average);
				 
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("---- ERROR-----");
			}
				
			 
		} while (counterCont > 0); 
		
		System.out.println("  FINISHED PROGRAM  ");
			
	}

}
