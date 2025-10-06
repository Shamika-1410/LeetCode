class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);map.put('V',5);map.put('X',10);map.put('L',50);
        map.put('C',100);map.put('D',500);map.put('M',1000);
        int ans = 0;
        int n = s.length();
        int i=0;
        for(i=0;i<n-1;i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            int one = map.get(c1);
            int two = map.get(c2);
            if(one<two){
                ans+=(two-one);
                i++;
            }else{
                ans+=one;
            }
        }
        if(i==n-1)ans+=map.get(s.charAt(i));
        return ans;
    }
}