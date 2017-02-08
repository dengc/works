//1/25/17
import java.util.*;
public class Flig_Game {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Put some +-: ");
		String input = in.next();
		
		flip(input);
	}
	
	public static void flip(String s){
		int l = s.length();
		String pp = "++";
		String mm ="--";
		
		int count = 0;
		String[] output = new String[l-1];
		for(int i=0; i<l-1;i++){
			if(s.substring(i, i+2).equals(pp)){
				output[count++]=s.substring(0, i)+mm+s.substring(i+2, l);
			}
		}
		
		for(String a : output){
			if(a != null){
				System.out.println(a);
			}
		}
	}

}
