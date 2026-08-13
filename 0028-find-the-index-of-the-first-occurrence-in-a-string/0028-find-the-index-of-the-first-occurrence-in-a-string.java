class Solution {
    public int strStr(String s, String t) {

        for (int i = 0; i <= s.length() - t.length(); i++) {

            int j = 0;

            while (j < t.length() && s.charAt(i + j) == t.charAt(j)) {
                j++;
            }

            if (j == t.length())
                return i;
        }

        return -1;
    }
}