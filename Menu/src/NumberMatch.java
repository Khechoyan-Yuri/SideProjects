import java.util.Scanner;

public class NumberMatch {
	public static void numMatch(){
		//Variables
				int numOne;
				int numTwo;
				boolean matchY = true;;
				boolean matchN = false;
				
				//Scanner Object
				Scanner keyboard = new Scanner(System.in);
				System.out.println("Enter the first number: ");
				numOne = keyboard.nextInt();
				
				System.out.println("Enter the second number ");
				numTwo = keyboard.nextInt();
				
				//error check - make sure userInput that is entered, is within boundaries
						while(numTwo != numOne){
							System.out.println("Match between " +numOne +"& " +numTwo +"is: " +matchN);
							System.out.println("Enter the second number ");
							numTwo = keyboard.nextInt();
						}//Closes while loop
						
						if(numTwo == numOne){
							System.out.println("Match between " +numOne +"& " +numTwo +"is: " +matchY);
						}
				keyboard.close();
	}
}
