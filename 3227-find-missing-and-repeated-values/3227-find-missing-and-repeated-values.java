class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new TreeSet<>();
        int ans[] = new int[2];
        int n = grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int a = grid[i][j];
                if(set.contains(a)){
                    ans[0]=a;
                }else{
                    set.add(a);
                }
            }
        }
        int prev = 0;
        for(Integer a : set){
            int next = a;
            if(next-prev!=1){
                ans[1]=next-1;
            }
            prev = next;
        }
        if(ans[1]==0)ans[1]=n*n;
        return ans;
    }
}