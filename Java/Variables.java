
public class Variables {
	
	private static int area; //Class Variable [static] means can be used within static methods
	public boolean status = true; //Instance Variable means can be used within any non-static method

	@SuppressWarnings("unused")
	public static void main(String[] args) {//Parameters
		//Local Variables
		int length; //Declaration which is declaring a variable as a data type or object
		int width = 5; //Instantiation which is a declaration of a variable and assigning a value
		length = 2; //Variables can be manipulated throughout the code
		
		area = length * width;
		System.out.println("Area: " + area); //Printing a variable prints its value
		System.out.println(length * (width - 3)); //Variables can be used in arithmetic
		
		//Primitive Data Type - data type predefined by the language and is named by a reserved keyword
		int num = 5; //Integer (Whole Number)
		double dec = 5.346; //Deciaml (Long)
		float currency = 5.30f; //Deciaml (Short and Precise)
		char letter = 's'; //Character
		boolean carWashed = false; //Boolean (True or False)
		long largeNum = 314159265359L; //Long (Large Number)
		
		dec += currency; //dec = dec + currency;
		System.out.println(dec);
		
		dec -= 34_000; //Underscores in numbers act as nothing but visual separators
	}

}
