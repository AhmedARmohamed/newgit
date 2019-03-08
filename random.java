package huncho;
import java.util.Random;
public class random {
	public static void main(String [] args) {
		Random dice = new Random();
		int numb;
		
		for(int counter=1;counter<=10;counter++) {
			numb = 1+ dice.nextInt(6);
			System.out.println(numb + " ");
		}
	}
	
}
