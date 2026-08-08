class Solution {
    public String restoreString(String s, int[] ind) {

        char[] a = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            a[ind[i]] = s.charAt(i);
        }

        return new String(a);
    }
}