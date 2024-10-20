class Solution {
    public static int longestConsecutive(int[] a) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<a.length;i++){
            if(!set.contains(a[i])){
                set.add(a[i]);
            }
        }
        // 1 ,2 ,3,4,100,200
        int len=0,maxLen=0;
        int one=0;
        if(!set.isEmpty()){
            int prev = set.first();
            for (Integer num : set) {
                if(one==0){
                    one=1;
                    continue;
                }
                int diff = num - prev;
                if(diff==1){
                    len++;
                    if(len>maxLen){
                        maxLen=len;
                    }
                }else{
                    len=0;
                }
                prev = num;
            }
            return maxLen+1;
        }
        return 0;
    }
}