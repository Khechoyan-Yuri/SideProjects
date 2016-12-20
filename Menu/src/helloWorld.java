import java.util.Scanner;

public class helloWorld{
	//Hello World Method
	public static void helloOut(){
		//Variables
				String helloName = "Hello, ";
				String name = "";
				
				//Scanner Object
				Scanner keyboard = new Scanner(System.in);
				System.out.println("\nPlease print your name: ");
				name = keyboard.nextLine();
				keyboard.close();
				//Print Phrase to user
				System.out.println(helloName +name);
	}
}
