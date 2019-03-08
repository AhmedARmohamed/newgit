package huncho;

public class array {
	public static void main(String args []) {
		System.out.println("index\tvalues ");
		int huncho[] = {23,34,54,65,76,87,98,90};
		
		for(int counter = 0; counter<huncho.length;counter++) {
			System.out.println(counter + "\t" + huncho[counter]);
		}
	}

}
