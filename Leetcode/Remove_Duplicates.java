//4/9/17
import java.util.*;
public class Remove_Duplicates{

	public int removeDuplicates(int[] nums) {

		int l = 0;

		for(int i = 0; i < nums.length - 1; i++){
			if(nums[i] < nums[i + 1]){
				nums[l++] = nums[i];
			}
		}
		if(nums.length > 0){
			nums[l++] = nums[nums.length - 1];
		}

		return l;
    }
}
