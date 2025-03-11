class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0;
        int ans = 0;
        int[] freq = new int[3];
        int n = s.length();
        for(int right = 0;right < n;right++){
            char c = s.charAt(right);
            freq[c-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                ans+=n-right;
                freq[s.charAt(left)-'a']--;
                left++;
            }
        }
        return ans;
    }
}