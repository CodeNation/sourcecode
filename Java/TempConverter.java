package Projects;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		float temp;
		char unit;
	    Scanner reader = new Scanner(System.in);      
	 
	    System.out.print("Enter Temperature: ");
	    temp = reader.nextInt();
	    System.out.print("Enter (f)Fahrenheit or (c)Celsius: ");
	    unit = reader.next().charAt(0);
	    
	    if(unit == 'f')
	    	temp = (temp * 9) / 5 + 32;
	    else
	    	temp = (temp - 32) * 5/9;
	 
	    System.out.println("\nConverted Temperature = " + temp);
	    reader.close();
	}

}
