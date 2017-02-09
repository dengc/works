//2/11/17
import java.util.*;
public class Two_Sum {

	public static void main(String[] args) {

		int[] nums = {6,20,25,9,7,66,2,19,93,4,27,11,26};

		Scanner in = new Scanner(System.in);

		System.out.println("Put a sum which you want to find: ");
		int input = in.nextInt();

		find_two_indexes(nums,input);
		//System.out.println("The two indexes are " + find_n(input) );

	}

	public static void find_two_indexes(int[] intArray, int sum){

		int a =0;
		int b =0;
		int temp;

		for(int i=0; i<intArray.length; i++){

			for(int j=i+1; j<intArray.length; j++){

				if(intArray[j]==sum-intArray[i]){

					a = intArray[i];
					b = intArray[j];
					break;
				}
			}
		}

		if(a>b){

			temp=a;
			a=b;
			b=temp;
		}

		System.out.println("The two indexes are " + a + " and " + b );
	}



}
