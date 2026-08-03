class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {

        int n = a.length, m = b.length;
        int[] c = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        while (i < n)
            c[k++] = a[i++];

        while (j < m)
            c[k++] = b[j++];

        int l = c.length;

        if (l % 2 == 0)
            return (c[l / 2] + c[l / 2 - 1]) / 2.0;

        return c[l / 2];
    }
}