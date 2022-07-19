package curso_progamacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("ola  eu  sou uma batata");
		
       String product1 = "Computer ";
       String product2 = "Office desk";
       
       int age = 30;
       int code = 5290;
       char gender = 'F';
       
       double price1 =2100.0;
       double price2  = 650.50;;
    		   double measure = 53.234567;
    		   
    		   System.out.println(product1 + "which price is $ " + price1  );
    		   System.out.println(product2 + "," + "witch price is $  " + price2  );
    		  
    		   System.out.println(age    +   " years old , " + "code "    + code    +   "   and gender:  " + gender );
    		   
    		   System.out.printf( "measue with eight decimal places  %.8f%n  " , measure );
    		   System.out.printf("Rouded (three decimmal places) %.3f%n " , measure );
    	Locale.setDefault(Locale.US);	   
    	System.out.printf("US decimal point %.3f%n" , measure );
		
		
		
		
		
		
		
		
		
		
		

	}

}
