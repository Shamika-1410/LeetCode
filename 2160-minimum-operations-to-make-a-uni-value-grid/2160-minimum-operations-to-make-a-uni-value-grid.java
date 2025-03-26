class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length;
        int m = grid[0].length;
        int a[] = new int[m*n];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[k++]=grid[i][j];
            }
        }
        Arrays.sort(a);
        int ans = 0;
        int median = a[m*n/2];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]%x != median%x){ return -1;}
                else ans+=Math.abs(median-grid[i][j])/x;
            }
        }
        return ans;
    }
}