class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        Map<Integer,Integer> map = new TreeMap<>();
        int prevStart = meetings[0][0];
        int prevEnd = meetings[0][1];
        map.put(prevStart,prevEnd);
        for(int i=1;i<meetings.length;i++){
            int start = meetings[i][0];
            int end = meetings[i][1];
            if(start<=prevEnd){
                map.put(prevStart,Math.max(end,prevEnd));
                prevEnd=Math.max(end,prevEnd);
            }else{
                map.put(start,end);
                prevStart=start;
                prevEnd=end;
            }
        }
        System.out.println(map.toString());
        int ans = 0,i=1,start=0,end=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            start = entry.getKey();
            end = entry.getValue();
            if(start!=i){
                ans+=start-i;
            }
            i=end+1;
        }
        if(end!=days)ans+=(days-end);
        // while(i<=days){
        //     if(map.containsKey(i)){
        //         i=map.get(i)+1;
        //     }else{
        //         ans++;
        //         i++;
        //     }
        // }
        return ans;
    }
}