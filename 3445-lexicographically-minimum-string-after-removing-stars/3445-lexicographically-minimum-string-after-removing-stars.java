class Solution {
    public String clearStars(String s) {
        int n = s.length();
        Map<Character, Deque<Integer>> map = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>();
        boolean[] str = new boolean[n];
        Arrays.fill(str,true);
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='*'){
               char small = pq.poll(); 
               int index = map.get(small).removeLast();
               str[i]=false;
               str[index]=false;
            }else{
                pq.offer(c);
                map.putIfAbsent(c, new ArrayDeque<>());
                map.get(c).addLast(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(str[i]){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}