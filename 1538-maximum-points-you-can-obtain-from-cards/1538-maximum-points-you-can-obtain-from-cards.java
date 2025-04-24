class Solution {
    public int maxScore(int[] C, int K) {
        int total = 0;
        for (int i = 0; i < K; i++) total += C[i];
        int best = total;
        int i = K-1,j=C.length-1;
        while(i>=0){
            total = total - C[i--] + C[j--];
            best = Math.max(total,best);
        }
        return best;
    }
}