class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] memory = new int[n][n];
        return solve(s, 0, n - 1, memory);
    }

    private int solve(String s, int i, int j, int[][] memory) {
        if (memory[i][j] != 0) {
            return memory[i][j];
        }
        if (i > j) {
            return 0;
        }
        if (i == j) {
            return 1;
        }

        if (s.charAt(i) == s.charAt(j)) {
            memory[i][j] = solve(s, i + 1, j - 1, memory) + 2;
        } else {
            memory[i][j] = Math.max(solve(s, i + 1, j, memory), solve(s, i, j - 1, memory));
        }
        return memory[i][j];
    }
}