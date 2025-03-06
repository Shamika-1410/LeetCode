class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int ans[] = new int[2];
        int n = grid.length;
        int N = n*n;
        int totalSum = N*(N+1)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int a = grid[i][j];
                if(set.contains(a)){
                    ans[0]=a;
                }else{
                    set.add(a);
                }
                sum+=a;
            }
        }
        sum-=ans[0];
        ans[1]=totalSum-sum;
        return ans;
    }
}