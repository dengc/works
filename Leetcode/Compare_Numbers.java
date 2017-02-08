//1/26/17
import java.util.*;
public class Compare_Numbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Put a string A: ");
		String a = in.next();
		
		System.out.println("Put a string B: ");
		String b = in.next();
		
		compareNums(a,b);
	}
	
	public static void compareNums(String a, String b){
		
		char[] aCharArray = a.toCharArray();
		char[] bCharArray = b.toCharArray();
		
		int la = a.length();
		int lb = b.length();
		
		double numA =0;
		double numB =0;
		int times =0;
		
		if(a.indexOf(".")==-1){
			for(int i=0; i< la;i++){
				
				times = (int) Math.pow(10, la-i-1);
				numA+=(aCharArray[i]-48)*times;
			}
		}
		else if(a.substring(la-2, la-1).equals(".")){
			
			for(int i=0; i< la-2;i++){
				
				times = (int) Math.pow(10, la-i-3);
				numA+=(aCharArray[i]-48)*times;
			}
			numA += (aCharArray[la-1]-48)*0.1;
		}
		else{
			
			for(int i=0; i< la-3;i++){
				
				times = (int) Math.pow(10, la-i-4);
				numA+= (aCharArray[i]-48)*times;
			}
			numA +=  (aCharArray[la-2]-48)*0.1;
			numA +=  (aCharArray[la-1]-48)*0.01;
		}
		
		//b
		if(b.indexOf(".")==-1){
			System.out.println("sss");
			for(int i=0; i< lb;i++){
				
				times = (int) Math.pow(10, lb-i-1);
				numB+= (bCharArray[i]-48)*times;
			}
		}
		else if(b.substring(lb-2, lb-1).equals(".")){
			
			for(int i=0; i< lb-2;i++){
				
				times = (int) Math.pow(10, lb-i-3);
				numB+= (bCharArray[i]-48)*times;
			}
			numB += (bCharArray[lb-1]-48)*0.1;
		}
		else if(b.substring(lb-3, lb-2).equals(".")){
			
			for(int i=0; i< lb-3;i++){
				
				times = (int) Math.pow(10, lb-i-4);
				numB+=(bCharArray[i]-48)*times;
			}
			numB += (bCharArray[lb-2]-48)*0.1;
			numB += (bCharArray[lb-1]-48)*0.01;
		
		}
		
		if(numA<numB){
			System.out.println("B is larger!");
			System.out.println(numA);
			System.out.println(numB);
		}
		else if(numA>numB){
			System.out.println("A is larger!");
			System.out.println(numA);
			System.out.println(numB);
		}
		else{
			System.out.println("A and B are the same!");
			System.out.println(numA);
			System.out.println(numB);
		}
	}

}
