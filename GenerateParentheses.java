package Leetcode;

public class GenerateParentheses {

}

class Solution {
    List<String> result = new ArrayList<>();
    int n;
    
    void gen(int left, int right, String current) {
        if (left == n && right == n) {
            result.add(current);
            return;
        }
        
        if (left < n) {
            gen(left + 1, right, current + "(");
        }
        
        if (right < left) {
            gen(left, right + 1, current + ")");
        }
    }
    
    public List<String> generateParenthesis(int num) {
        n = num;
        gen(0, 0, "");
        return result;
    }
}
