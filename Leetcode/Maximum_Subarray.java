//4/10/17
import java.util.*;
public class Maximum_Subarray{

	public int maxSubArray(int[] nums) {

		int max = nums[0];
		int maxWith = max;

		for(int i = 1; i < nums.length; i++){
			maxWith = Math.max(maxWith + nums[i], nums[i]);
			max = Math.max(max, maxWith);
		}
		return max;
    }
}
