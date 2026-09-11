class Solution {
    public int totalNumbers(int[] d) {
        int c = 0;

        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int e = 0; e <= 8; e += 2) {

                    int[] x = new int[10];
                    x[a]++;
                    x[b]++;
                    x[e]++;

                    boolean ok = true;

                    for (int i = 0; i < 10; i++) {
                        int need = x[i];
                        int have = 0;

                        for (int n : d) {
                            if (n == i)
                                have++;
                        }

                        if (have < need)
                            ok = false;
                    }

                    if (ok)
                        c++;
                }
            }
        }

        return c;
    }
}