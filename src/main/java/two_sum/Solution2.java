//package two_sum;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Solution2 {
//
//    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        System.out.println(Arrays.toString(twoSum(nums, target)));
//
//    }
//
//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> numbers = new HashMap<>();
//
//        for(int i=0; i<nums.length; i++) {
//            numbers.put(i, nums[i]);
//        }
//
//        for(int i=0; i<nums.length; i++) {
//            int requiredNumber = nums[i]-target;
//            if(numbers.containsValue(requiredNumber) && numbers) {
//                return new int[] {numbers.}
//            }
//        }
//    }
//}
