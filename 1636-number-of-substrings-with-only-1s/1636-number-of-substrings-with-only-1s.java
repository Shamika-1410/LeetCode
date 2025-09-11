class Solution {
    public int numSub(String s) {
        int n = s.length();
        int MOD = 1000000007;
        int ans = 0;
        int len = 0;
        if(s.charAt(0)=='1'){
            len++;
            ans++;
        }
        for(int i=1;i<n;i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if(curr == prev && curr=='1'){
                len++;
            }else if(curr == prev && curr=='0'){
                len = 0;
            }else if(curr=='1' && prev=='0'){
                len = 1;
            }else{
                len = 0;
            }
            ans = (ans+len)%MOD;
        }
        return ans;
    }
}