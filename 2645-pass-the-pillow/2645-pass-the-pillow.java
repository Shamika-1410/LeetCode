class Solution {
    public int passThePillow(int n, int time) {
        int rounds = time / (n - 1);
        int etime = time % (n - 1);
        if (rounds % 2 == 0) {
            return etime + 1; 
        } else {
            return n - etime;
        }
    }
}