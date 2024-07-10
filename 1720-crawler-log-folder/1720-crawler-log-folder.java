class Solution {
    public int minOperations(String[] logs) {
        int n = logs.length;
        //String cd = "main";
        int ans = 0;
        for(int i=0;i<n;i++){
            String s = logs[i];
            if(s.equals("./")){
                continue;
            }else if(s.equals("../")){
                if(ans-1>=0) ans--;
                else ans = 0;
            }else{
                ans++;
            }
        }
        if(ans>0) return ans;
        return 0;
    }
}