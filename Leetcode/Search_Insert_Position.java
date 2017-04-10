//4/9/17
import java.util.*;
public class Search_Insert_Position {

	public static int searchInsert(int[] nums, int target) {

		for(int i = 0; i < nums.length; i++){

			if(nums[i] >= target){
				return i;
			}
		}

		return nums.length;
    }
}
