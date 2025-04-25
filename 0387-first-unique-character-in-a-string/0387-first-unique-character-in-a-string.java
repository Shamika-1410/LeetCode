class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(map.get(c)==1)return i;
        }
        return -1;
    }
}