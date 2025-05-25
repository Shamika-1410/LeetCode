class Solution {
    public int titleToNumber(String s) {
        int i = s.length()-1;
        int n = 0;
        Map<Character,Integer> map = new HashMap<>();
        int j = 65;
        for(int b=0;b<26;b++){
            map.put((char)j,b);
            j++;
        }
        int p = 0;
        while(i>=0){
            char c = s.charAt(i);
            int k = map.get(c);
            k++;
            n+=k*Math.pow(26,p);
            p++;
            i--;
        }
        return n;
    }
}