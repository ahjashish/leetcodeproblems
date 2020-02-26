import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> symMap = new HashMap<>();
        symMap.put(')', '(');
        symMap.put('}', '{');
        symMap.put(']', '[');
        Stack<Character> tracker = new Stack<>();
        
        // Base cases
        if (s == null || s.length() == 0) {
            return true;
        }

        for (char c : s.toCharArray()) {
            if(symMap.containsValue(c)) {
                tracker.push(c);
            }
            if(symMap.containsKey(c)) {
                if(!tracker.isEmpty() && tracker.peek() == symMap.get(c)) {
                    tracker.pop();
                } else {
                    return false;
                }
            }
        }
        return tracker.isEmpty();
    }
}
// @lc code=end

