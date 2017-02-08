//1/24/17
import java.util.*;
public class Ransom_Note {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Put a ransom note: ");
		String a = in.next();
		
		System.out.println("Put a magazine: ");
		String b = in.next();
		
		canConstruct(a,b);
	}
	
	public static void canConstruct(String a, String b){
		
		int la = a.length();
		int lb = b.length();
		boolean flag = false;
		for(int i=0;i<lb-la+1;i++){
			if(a.equals(b.substring(i,i+la))){
				System.out.println("True");	
				flag = true;
				break;
			}
		}
		if(!flag == true){
			System.out.println("False");
		}
	}

}
