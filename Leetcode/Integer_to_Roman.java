//3/20/17
import java.util.*;
public class Integer_to_Roman {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Puth: ");
		int input = in.nextInt();

		System.out.println("The is " + intToRoman(input));

	}

	public static String intToRoman(int num) {

		String result ="";
		if(numLength(num) == 4){
			int thousand = num/1000;
			while(thousand !=0){
				result += "M";
				thousand--;
				num -= 1000;
			}
			int hundred = num/100;
			result += hundredRoman(hundred);
			num -= hundred * 100;
			int tens = num/10;
			result += tensRoman(tens);
			num -= tens * 10;
			result += tailRoman(num);
		}
		else if(numLength(num) == 3) {
			int hundred = num/100;
			result += hundredRoman(hundred);
			num -= hundred * 100;
			int tens = num/10;
			result += tensRoman(tens);
			num -= tens * 10;
			result += tailRoman(num);
		}
		else if(numLength(num) == 2) {

			int tens = num/10;
			result += tensRoman(tens);
			num -= tens * 10;
			result += tailRoman(num);
		}
		else {
			result += tailRoman(num);
		}

		return result;
    }

	public static int numLength(int i){

		String iToS = Integer.toString(i);
		return iToS.length();
	}

	public static String hundredRoman(int num){
		String result ="";
		if(num < 5){
			if(num ==4){
				result = "CD";
			}
			else{
				while(num !=0){
					result += "C";
					num--;
				}
			}
		}
		else{
			if(num ==9){
				result = "CM";
			}
			else{
				result += "D";
				num -= 5;
				while(num !=0){
					result += "C";
					num--;
				}
			}
		}
		return result;
	}

	public static String tensRoman(int num){
		String result ="";
		if(num < 5){
			if(num ==4){
				result = "XL";
			}
			else{
				while(num !=0){
					result += "X";
					num--;
				}
			}
		}
		else{
			if(num ==9){
				result = "XC";
			}
			else{
				result += "L";
				num -= 5;
				while(num !=0){
					result += "X";
					num--;
				}
			}
		}
		return result;
	}

	public static String tailRoman(int num){
		String result ="";
		if(num < 5){
			if(num ==4){
				result = "IV";
			}
			else{
				while(num !=0){
					result += "I";
					num--;
				}
			}
		}
		else{
			if(num ==9){
				result = "IX";
			}
			else{
				result += "V";
				num -= 5;
				while(num !=0){
					result += "I";
					num--;
				}
			}
		}
		return result;
	}

}
