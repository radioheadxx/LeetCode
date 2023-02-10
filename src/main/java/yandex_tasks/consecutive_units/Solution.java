package yandex_tasks.consecutive_units;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 0, 4, 1, 1, 1};
        System.out.println(countUnits(arr));
    }

    public static int countUnits(int[] ints) {
        int count = 0;
        int max = 0;

        for(int i=0; i<ints.length; i++) {
            if(ints[i] == 1) {
                ++count;
                if(count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return count;
    }
}
