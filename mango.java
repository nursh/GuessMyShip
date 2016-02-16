
import java.util.*;
public class mango{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inta = scanner.nextLine();
		System.out.println(inta);
		int[] inte = new int[3];	
		int i = 0;
		for(char c: inta.toCharArray()){
				if(!(Character.isWhitespace(c))) {
					inte[i] = Character.getNumericValue(c);
					System.out.println(inte[i]);
					i++;
				}
				
		}
		
	}
}