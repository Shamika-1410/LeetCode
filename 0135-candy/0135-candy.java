class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if(n==1)return 1;
        if(n==2){
            if(ratings[0]==ratings[1])return 2;
            return 3;
        }
        //TreeMap<Integer,Integer> map = new TreeMap<>(n);
        int[] candies = new int[n];
        int ans = 0;
        Arrays.fill(candies,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }
        for(int i=n-1;i>0;i--){
            if(ratings[i-1]>ratings[i]){
                candies[i-1]=Math.max(candies[i-1],candies[i]+1);
            }
            ans += candies[i-1];
        }
        return ans +  candies[n-1];
        
    }
}