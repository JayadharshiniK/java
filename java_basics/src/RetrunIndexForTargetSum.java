import java.util.HashMap;
import java.util.Map;

public class RetrunIndexForTargetSum {
    public static void main(String[] args) {
//        int[] nums = {2,7,11,15,3};
//        int  target = 14;
//        int[] nums = {3,2,4};
//        int  target = 6;
        int[] nums = {3,3};
        int  target = 6;
        int[] output = twoSum(nums, target);
        System.out.println(output[0] + "," + output[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> currentMinusTargetIndexMap = new HashMap();
        for (int i = 0; i <= nums.length; i++) {
            int currentElement =  nums[i];
            if (currentMinusTargetIndexMap.containsKey(currentElement)) {
                int[] output = new int[2];
                output[0] = currentMinusTargetIndexMap.get(currentElement);
                output[1] = i;
                return output;
            }
            int currentMinusTarget = target - currentElement;
            currentMinusTargetIndexMap.put(currentMinusTarget, i);
        }
        return null;
    }
}


//7, 0