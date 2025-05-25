class Solution {
    public String convertToTitle(int n) {
        Map<Integer,Character> map = new HashMap<>();
        int j = 65;
        for(int i=0;i<26;i++){
            map.put(i,(char)j);
            j++;
        }
        StringBuilder s = new StringBuilder();
        while(n>0){
            n--;
            int rem = n%26;
            s.append(map.get(rem));
            n=n/26;
        }
        return s.reverse().toString();
    }
}