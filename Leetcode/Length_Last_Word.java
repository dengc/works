//2/10/17
import java.util.*;
public class Length_Last_Word {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Put a string to see the length of the last word: ");
		String input = in.nextLine();

		System.out.println(last_word(input));

	}

	public static int last_word(String s){
		String[] parts = s.split(" ");
        if(parts.length > 0){
            return parts[parts.length-1].length();
        }
        return 0;
	}
}
