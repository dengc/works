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

	public static String add_Binary(String a, String b){

		int sum;
		String sumString="";

		int aLength = a.length();
		int bLength = b.length();

		int aNum=0;
		int bNum=0;

		for(int i=0; i<aLength; i++){

			int pointer = Integer.parseInt(a.substring(aLength-1-i,aLength-i));
			aNum += pointer * Math.pow(2,i);
		}

		for(int i=0; i<bLength; i++){

			int pointer = Integer.parseInt(b.substring(bLength-1-i,bLength-i));
			bNum += pointer * Math.pow(2,i);
		}

		sum = aNum + bNum;

		ArrayList<Integer> index = new ArrayList<Integer>();

		while(sum>0){

			int i = (int) Math.floor(Math.log(sum)/Math.log(2));
			index.add(i);
			sum -= Math.pow(2,i);

		}

		//System.out.println(index);

		ArrayList<String> sums = new ArrayList<String>();

		for(int i=0;i<index.get(0)+1; i++){

			sums.add("0");
		}

		for(int i=0; i<index.size(); i++){

			sums.set((index.get(0)-index.get(i)),"1");
		}

		for(int i=0; i<sums.size(); i++){

			sumString += sums.get(i);
		}



		return sumString;
	}



}
