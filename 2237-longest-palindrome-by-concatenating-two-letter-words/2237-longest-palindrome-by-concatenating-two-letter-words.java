class Solution {
    public int longestPalindrome(String[] words) {
        int n = words.length;
        int ans = 0;
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        int odd = 0;
        System.out.println(map);
        for(Map.Entry<String,Integer> e : map.entrySet()){
            String w = e.getKey();
            int freq = e.getValue();
            String s = new StringBuilder(w).reverse().toString();
            if(w.equals(s)){
                ans+=(freq/2)*4;
                if(freq%2==1){
                    odd=1;
                }
            }else if(w.compareTo(s) < 0 && map.containsKey(s)){
                    ans+=Math.min(freq,map.get(s))*4;
                }
            }
        return ans + odd*2;
    }
}