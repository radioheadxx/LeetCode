package merge_arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 8, 9, 10};
        int[] arr2 = {1, 2, 5};
        int[] result = merge(arr1, arr2);
        for(int i : result) {
            System.out.print(i);
        }

    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length+arr2.length];
        int k = 0;
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr2.length; j++) {
                if(arr1[i] < arr2[j]) {
                    merged[k] = arr1[i];
                    k++;
                    i++;

                }
                else if (arr1[i] == arr2[j]) {
                    merged[k] = arr1[i];
                    merged[k+1] = arr2[j];
                    k=k+2;
                } else {
                        merged[k] = arr2[j];
                        k++;
                        j++;
                    }
                }
            }
        return merged;
    }
}

