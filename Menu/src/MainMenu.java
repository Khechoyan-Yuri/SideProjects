import java.util.Scanner;

public class MainMenu{
	public static void main(String[] args){
		//Variables
		int userChoice;
	
		//Scanner Object
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1: Hello World");
		System.out.println("2: Calculator");
		System.out.println("3: Number Matching");
		System.out.println("\nPlease select the activity that you would like to perform: ");
		userChoice = keyboard.nextInt();
		
		//error check - make sure userInput that is entered, is within boundaries
		while(userChoice != 1 && userChoice != 2 && userChoice != 3){
			System.out.println("1: Hello World");
			System.out.println("2: Calculator");
			System.out.println("3: Number Matching");
			System.out.println("\nThat was not a valid number. Please choose an activity: ");
			userChoice = keyboard.nextInt();
		}//Closes while loop
		
		//Executes decide method - output correct phrase 
		//to user and executes correct method
		decide();
		
		keyboard.close();
		
	}//Closes Main method

	public static void decide(){
		//Variables
		String helloPhrase = "- Hello World";
		String calc = "- Calculator";
		String numMatch = "- Number Matching";
		int userInput = userChoice;
		
		switch(userInput){
		case 1:
			System.out.println("You have selected: " +userInput +helloPhrase);
			helloWorld.helloOut();
			break;
		case 2:
			System.out.println("You have selected: " +userInput +calc);
			Calculator.calculate();
			break;
		case 3:
			System.out.println("You have selected: " +userInput +" " +numMatch);
			NumberMatch.numMatch();
			break;
		}//Closes switch statement
		

	}//Closes decide method
	
}//Closes MainMenu Class
