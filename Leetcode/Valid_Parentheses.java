//2/9/17
import java.util.*;
public class Valid_Parentheses {

	public boolean isValid(String s) {


		ArrayList<Integer> pointer = new ArrayList<Integer>();

		char[] sToChar = s.toCharArray();

		for(int i=0; i<s.length(); i++){

			if(sToChar[i]=='('){
				pointer.add(1);
			}
			else if (sToChar[i]=='[') {
				pointer.add(2);
			}
			else if (sToChar[i]=='{') {
				pointer.add(3);
			}
			else if (sToChar[i]==')') {
				pointer.add(-1);
			}
			else if (sToChar[i]==']') {
				pointer.add(-2);
			}
			else if (sToChar[i]=='}') {
				pointer.add(-3);
			}
		}

		int count=0;
		int pSize = pointer.size();

		if(pSize%2 ==1){
			return false;
		}

		while(count<pSize/2){

			for(int i=1; i<pointer.size(); i++){

				if(pointer.get(i)== 0-pointer.get(i-1)){

					pointer.remove(i);
					pointer.remove(i-1);

				}
			}

			count++;
		}

		if(pointer.size()==0){
			return true;
		}
		else{
			return false;
		}

	}
}
