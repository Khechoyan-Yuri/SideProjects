import java.util.Scanner;

public class Calculator{
	public static void calculate(){
		//Variables
		int numOne;
		int numTwo;
		int operation;
		int result;
		
		//Scanner Object
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		numOne = keyboard.nextInt();
		
		System.out.println("Enter the second number ");
		numTwo = keyboard.nextInt();
		
		System.out.println("What would you like to do with these numbers: ");
		System.out.println("1. add | 2. subtract | 3. multiply | 4. divide");
		operation = keyboard.nextInt();
		
		//error check - make sure userInput that is entered, is within boundaries
				while(operation != 1 && operation != 2 && operation != 3 && operation != 4){
					System.out.println("1. add | 2. subtract | 3. multiply | 4. divide");
					System.out.println("Invalid Operation try again: ");
					operation = keyboard.nextInt();
				}//Closes while loop
				
				switch(operation){
				case 1:
					result = numOne + numTwo;
					System.out.println(numOne +"+" +numTwo +"= " +result);
					break;
				case 2:
					result = numOne - numTwo;
					System.out.println(numOne +"-" +numTwo +"= " +result);
					break;
				case 3:
					result = numOne * numTwo;
					System.out.println(numOne +"*" +numTwo +"= " +result);
					break;
				case 4:
					result = numOne / numTwo;
					System.out.println(numOne +"/" +numTwo +"= " +result);
					break;
				}//Closes switch statement
				
				keyboard.close();
	}//Closes calculate method
}//Closes Calculator Class
