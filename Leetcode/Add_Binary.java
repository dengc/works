//2/7/17
import java.util.*;
public class Add_Binary {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Put a binary (0,1): ");
		String a = in.next();

		System.out.println("Put another binary (0,1): ");
		String b = in.next();

		System.out.println("The sum of the two is: " + add_Binary(a,b));

	}

	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int la = a.length() - 1;
		int lb = b.length() - 1;
		int carry = 0;
		while(la > -1 || lb > -1){
			int sum = carry;
			if(la > -1){
				sum += a.charAt(la--) - '0';
			}
			if(lb > -1){
				sum += b.charAt(lb--) - '0';
			}
			sb.append(sum % 2);
			carry = sum/2;
		}
		if(carry != 0){
			sb.append(carry);
		}
		return sb.reverse().toString();
    }
}
