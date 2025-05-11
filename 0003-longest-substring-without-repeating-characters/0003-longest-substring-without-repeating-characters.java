class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int n = s.length();
        int maxLen = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int right=0;right<n;right++){
          char c = s.charAt(right);
          int len;
          if(map.containsKey(c) && map.get(c)>=left){
            left = map.get(c)+1;
          }
          map.put(c,right);
          len = right-left+1;
          maxLen = Math.max(maxLen,len);
        }
        return maxLen;
    }
}