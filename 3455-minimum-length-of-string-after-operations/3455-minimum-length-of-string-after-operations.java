class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            int freq = e.getValue();
            if(freq%2==1 && freq>=3){
                n=n-(freq-1);
            }else if(freq%2==0 && freq>=3){
                n=n-(freq-2);
            }
        }
        return n;
    }
}