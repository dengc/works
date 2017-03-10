//2/12/17
//Not finished
import java.util.*;
public class longest_Repeating_Substring {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Put a string which you want to find the longest_Repeating_Substring_Length: ");
		String input = in.next();

		System.out.println("The length is " + longest_Repeating_Substring_Length(input));

	}

	public static int longest_Repeating_Substring_Length(String s){

		int l = s.length();

		int pointer = l-1;

		for(int i=0; i<l-pointer; i++){

			for(int j=i+1; j<l-pointer+1; j++){

				if(s.substring(i,pointer).equals(s.substring(j,pointer+j))){

					return pointer;
				}
			}

			pointer --;

		}

		return pointer;

	}

}
