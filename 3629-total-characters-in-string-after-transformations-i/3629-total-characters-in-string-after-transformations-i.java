class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int ans = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            int a = 'z'-c;
            if(a<t){
                ans+=2;
            }else{
                ans++;
            }
        }
        return ans;
    }
}