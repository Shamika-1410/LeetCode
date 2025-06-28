class Solution {
    public int climbStairs(int n) {
        n=n+1;
        if(n==1 || n==2) { return 1;}
        int prev = 0;
        int curr = 1;
        for(int i=0;i<=n-2;i++){
            int temp = prev;
            prev = curr;
            curr = temp + curr;
        }
        return curr;
    }
}