package programmer.yanizamovramil.problems.solutions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] bruteForce(int[] nums, int target) {
        int[] sum = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int result = nums[i] + nums[j];
                if (result == target) {
                    sum[0] = i;
                    sum[1] = j;
                    return sum;
                }
            }
        }
        return null;
    }

    public int[] optimizedByHashTable(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
