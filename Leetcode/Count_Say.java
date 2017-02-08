//2/8/17
import java.util.*;
public class Count_Say {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Put a number(n) to find the nth value: ");
		int input = in.nextInt();

		System.out.println("The nth value is " + find_n(input) );

	}

	public static String find_n(int n){

		if(n == 1){
			return "1";
		}
		else{
			return count_say(find_n(n-1));
		}

	}

	public static String count_say(String s){

		int count=1;
		String output ="";

		char[] sToChar = s.toCharArray();

		if(s.equals("1")){

			return "11";
		}

		for(int i=1; i<s.length(); i++){

			if(sToChar[i] == sToChar[i-1]){

				count ++;
			}
			else{

				output += count;
				output += sToChar[i-1];
				count =1;
			}
		}
		output += count;
		output += sToChar[s.length()-1];

		return output;
	}

}
