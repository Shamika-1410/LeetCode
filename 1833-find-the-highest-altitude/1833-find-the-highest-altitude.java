class Solution {
    public int largestAltitude(int[] gains) {
        int max = 0;
        int ht = 0;
        for(int gain : gains){
            ht += gain;
            max = Math.max(max,ht);
        }
        return max;
    }
}