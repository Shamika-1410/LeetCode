class Solution {
    public int countHomogenous(String s) {
        int MOD = 1000000007;
        int n = s.length();
        char[] arr = s.toCharArray();
        int len = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            if(i==0 || arr[i]==arr[i-1]){
                len++;
            }else{
                len = 1;
            }
            ans = (ans+len)%MOD;
        }
        return ans;
    }
}