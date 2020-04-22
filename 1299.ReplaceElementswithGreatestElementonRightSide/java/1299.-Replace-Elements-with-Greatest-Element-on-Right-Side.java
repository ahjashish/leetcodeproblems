import java.util.*;

class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length - 1;
        int currMax = -1;
        while(len >= 0) {
            if(arr[len] < currMax) {
                arr[len] = currMax;
            }
            else {
                int max = currMax;
                currMax = arr[len];
                arr[len] = max;
            }
            len--;
        }
        return arr;
    }
}
