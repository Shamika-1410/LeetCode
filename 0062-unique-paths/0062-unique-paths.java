class Solution {
    public int uniquePaths(int m, int n) {
        int[] above = new int[n];
        Arrays.fill(above,1);
        for(int i=1;i<m;i++){
            int[] curr = new int[n];
            Arrays.fill(curr,1);
            for(int j=1;j<n;j++){
                curr[j]=curr[j-1]+above[j];
            }
            above = curr;
        }
        return above[n-1];
    }
}