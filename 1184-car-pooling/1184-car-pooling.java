class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] locations = new int[1001];
        for(int[] t: trips){
            locations[t[1]] += t[0];
            locations[t[2]] -= t[0];
        }
        for(int i=0;capacity >= 0 && i<1001;i++) capacity -= locations[i];
        return capacity >= 0;
    }
}