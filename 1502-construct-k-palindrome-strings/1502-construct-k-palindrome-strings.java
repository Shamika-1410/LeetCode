class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();
        if(n<k) return false;
        if(n==k) return true;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int odd=0;
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            int val = e.getValue();
            if(val%2==1){
                odd++;
            }
        }
        return odd<=k;

    }
}