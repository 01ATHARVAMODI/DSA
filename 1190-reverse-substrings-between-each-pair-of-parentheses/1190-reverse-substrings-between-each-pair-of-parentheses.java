class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c != ')') {
                st.push(c);
            } else {
                StringBuilder t = new StringBuilder();

                while (st.peek() != '(') {
                    t.append(st.pop());
                }

                st.pop();

                for (char x : t.toString().toCharArray())
                    st.push(x);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty())
            ans.append(st.pop());

        return ans.reverse().toString();
    }
}