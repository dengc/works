//1/23/17
import java.util.*;

public class Reverse_Vowels {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Put a String:");
		String s = in.nextLine();
		System.out.println("Reversed:");
		
		int l =s.length();	

		int[] index = new int[l];
		int count =0;
		String[] vowel  = {"a","e","i","o","u"};
		for(int i = 0;i<l;i++){
			for(String v : vowel){
				if (v.equals(s.substring(i,i+1))){
					index[count++]=i;
				}
			}
		}
		
		char[] sToChar = s.toCharArray();
		Random rand = new Random();
		
		while(1==1){
			int n1 = rand.nextInt(count);
			int n2 = rand.nextInt(count);
			String sub1 = s.substring(index[n1],index[n1]+1);
			String sub2 = s.substring(index[n2],index[n2]+1);
			if(!sub1.equals(sub2)){
				char temp = sToChar[index[n1]];
				sToChar[index[n1]]=sToChar[index[n2]];
				sToChar[index[n2]]=temp;
				System.out.println(sToChar);
				break;
			}
		}
	}
}
