class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A == null || A.length == 0) return null;
        int C = A[0].length;
        for (int[] t : A) {
            for (int i = 0; i < (C+1 / 2); i++) {
                int temp = t[i]^1;
                t[i] = t[C - 1 - i] ^ 1;
                t[C - 1 - i] = temp;
            }
        }
        return A;
    }
}