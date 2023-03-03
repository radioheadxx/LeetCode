package two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Дан массив целых чисел, вернуть индексы двух чисел, которые в сумме даюх указанное число(target)
// Предположите, что данные в массиве имеют только одно решение или не имеют его вовсе

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 15};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException();
    }

}
