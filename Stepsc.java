import java.util.Scanner;

public class Stepsc {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    
	    String[] empName = new String[5];
	    String[] empAddress = new String[5];
	    String[] empEmail = new String[5];
	    
	    empName[0] = "Stephanie Hugo";
	    empAddress[0] = "Baler, Aurora";
	    empEmail[0] = "hugostp@email.com";
	    
	    empName[1] = "Sung jin Woo";
	    empAddress[1] = "Seoul, South Korea";
	    empEmail[1] = "arise123@email.com";
	    
	    empName[2] = "Cha hae In";
	    empAddress[2] = "Pyongyang, North Korea";
	    empEmail[2] = "haein@email.com";
	    
	    empName[3] = "Igris Beru";
	    empAddress[3] = "Setan, Calabuanan";
	    empEmail[3] = "igrisb@email.com";
	    
	    empName[4] = "Step Esteron";
	    empAddress[4] = "Sitio, Dikoalam";
	    empEmail[4] = "step@email.com";
	  
	    
	    System.out.print(" Please enter an index number between 0-4: ");
	    
	    do {
	        
	        userInput = scanner.nextInt();
	        
	        
	       if (userInput >= 0 && userInput <= 4 ) {
	           System.out.println(userInput + "Employee Name:" + empName[userInput]);
	           System.out.println(userInput + "Employee Address:" + empAddress[userInput]);
	           System.out.println(userInput + "Emploee Email:" + empEmail[userInput]);
	           
	       }else{
	           
	           System.out.println("Invalid input. Please enter an index number between 0-4");
	         }
	       
	       } while (userInput != -1);
	       
	       System.out.println("Program has been exited.");
	       
	    }
	    
      } 
