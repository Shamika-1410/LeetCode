class Solution {

    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int N = rowSum.length;
        int M = colSum.length;

        int[] currRowSum = new int[N];
        int[] currColSum = new int[M];

        int[][] origMatrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                origMatrix[i][j] = Math.min(
                    rowSum[i] - currRowSum[i],
                    colSum[j] - currColSum[j]
                );

                currRowSum[i] += origMatrix[i][j];
                currColSum[j] += origMatrix[i][j];
            }
        }
        return origMatrix;
    }
}