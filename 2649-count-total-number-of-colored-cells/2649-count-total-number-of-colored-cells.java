class Solution {
    public long coloredCells(int n) {
        long a = (long)Math.pow(n,2);
        long b=(long)Math.pow(n-1,2);
        return a+b;
    }
}