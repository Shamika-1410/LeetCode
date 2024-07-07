class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int full = numBottles;
        int ans = numBottles;
        int empty = full;
        while(empty>=numExchange){
            int extoGetFull = empty/numExchange;
            full = extoGetFull;
            ans+=extoGetFull;
            empty=full + empty%numExchange;
        }
        return ans;
    }
}