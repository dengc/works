//4/10/17
import java.util.*;
public class Sqrt(x){

	public int mySqrt(int x) {
		if(x == 1 || x == 2){
			return 1;
		}
		if(x >= 2147395600){
			return 46340;
		}
		for(int i = 1; i < x; i++){
			if(i * i > x){
				return i - 1;
			}
		}
		return 0;
    }
}
