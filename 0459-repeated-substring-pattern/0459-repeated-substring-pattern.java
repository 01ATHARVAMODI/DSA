class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        for (int i = 1; i <= n / 2; i++) {

            if (n % i != 0)
                continue;

            String t = s.substring(0, i);
            String x = "";

            for (int j = 0; j < n / i; j++)
                x += t;

            if (x.equals(s))
                return true;
        }

        return false;
    }
}