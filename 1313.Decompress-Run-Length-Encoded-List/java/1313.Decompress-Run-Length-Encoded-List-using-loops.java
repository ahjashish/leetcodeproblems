import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> acc = new ArrayList<>();
        for (int i = 0; 2 * i + 1 < nums.length; i++) {
            int freq = nums[2 * i];
            int value = nums[2 * i + 1];
            while (freq > 0) {
                acc.add(value);
                freq--;
            }
        }

        int[] res = new int[acc.size()];
        for (int j = 0; j < acc.size(); j++) {
            res[j] = acc.get(j);
        }
        return res;
    }
}