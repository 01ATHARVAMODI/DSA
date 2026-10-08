class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int c = 0;

        for (char x : s.toCharArray()) {
            if (x == '(') {
                if (c > 0)
                    ans.append(x);
                c++;
            } else {
                c--;
                if (c > 0)
                    ans.append(x);
            }
        }

        return ans.toString();
    }
}