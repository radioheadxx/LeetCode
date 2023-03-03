package merge_arrays;

public class Solution {
    public static void main(String[] args) {
        int a[] = {1, 1, 2, 3, 4, 5, 5, 6};
        int b[] = {3, 3, 5, 6, 7, 8, 8, 9, 9, 9, 9, 10};
        int[] result = merge(a, b);
        for(int i : result) {
            System.out.print(i);
        }

    }

    public static int[] merge(int[] a, int[] b) {
        int c[] = new int[a.length + b.length];
        int bCounter = 0;
        int aCounter = 0;

        for (int i = 0; i < c.length-1; i++) {
            if (a[aCounter] < b[bCounter]) {
                c[i] = a[aCounter];
                aCounter++;
            } else if(a[aCounter] > b[bCounter]){
                    c[i] = b[bCounter];
                    bCounter++;
            } else {
                c[i] = a[aCounter];
                c[i+1] = c[bCounter];
                aCounter++;
                bCounter++;
            }
        }
        return c;
    }
}

