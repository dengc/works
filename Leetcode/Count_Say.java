//2/8/17
import java.util.*;
public class Count_Say {

	public String countAndSay(int n) {

        if(n == 1){
			return "1";
		}
		else{
			return count_say(countAndSay(n-1));
		}
    }

    public String count_say(String s){

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
