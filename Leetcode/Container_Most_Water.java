//3/20/17
import java.util.*;
public class Container_Most_Water {
	public static int maxArea(int[] height) {

		int result =0;
		int i =0;
		int j =height.length-1;

		while(i<j){
			int w = j-i;
			int h = Math.min(height[i],height[j]);

			result = Math.max(result,w * h);

			while(height[i] <= h && i<j){
				i++;
			}
			while(height[j] <= h && i<j){
				j--;
			}
		}

		return result;
    }

}
