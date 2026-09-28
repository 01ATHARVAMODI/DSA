class Solution {
    public int maxDepth(String s) {
        int c = 0, max = 0;

        for (char x : s.toCharArray()) {
            if (x == '(') {
                c++;
                max = Math.max(max, c);
            } 
            else if (x == ')') {
                c--;
            }
        }

        return max;
    }
}