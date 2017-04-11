//4/10/17
import java.util.*;
public class Climbing_Stairs{

	public int climbStairs(int n) {
		if(n <= 0){
			return 0;
		}
		if(n == 1){
			return 1;
		}

		int[] nums = new int[n+1];
		nums[0] = 0;
		nums[1] = 1;
		nums[2] = 2;
		for(int i = 3; i < n+1; i++){
			nums[i] = nums[i - 1] + nums[i - 2];
		}
		return nums[n];
    }
}
