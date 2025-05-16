class Solution {
    public int strStr(String haystack, String needle) {
        
        int h = haystack.length();
        int n = needle.length();
        if(h==n){
            if(haystack.equals(needle))return 0;
            else return -1;
        }
        int ans = -1;
        for(int i=0;i<=h-n;i++){
            String s = haystack.substring(i,i+n);
            if(s.equals(needle)){ans = i; break;} 
        }
        return ans;
    }
}