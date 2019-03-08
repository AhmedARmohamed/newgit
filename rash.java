package huncho;
import java.util.Scanner;
public class rash {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		el elObj = new el();
		System.out.println("Enter your name here :");
		String name = input.nextLine();
		
		elObj.simplemessage(name);
		}

}
