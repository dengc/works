//3/30/17
import java.util.*;
public class Roman_to_Integer {

	public static int romanToInt(String s) {

		int l = s.length();
		int result =0;
		for(int i=0; i<l; i++){
			int num1 = basicRomanInt(s.substring(i,i+1));
			if(i < l-1){
				int num2 = basicRomanInt(s.substring(i+1,i+2));
				if(num1<num2){
					num1 = 0-num1;
				}
			}
			result += num1;
		}
		return result;
    }

	public static int basicRomanInt(String s){
		if(s.equals("I")){
			return 1;
		}
		else if(s.equals("V")){
			return 5;
		}
		else if(s.equals("X")){
			return 10;
		}
		else if(s.equals("L")){
			return 50;
		}
		else if(s.equals("C")){
			return 100;
		}
		else if(s.equals("D")){
			return 500;
		}
		else{
			return 1000;
		}
	}
}
