class Solution {

    public long coloredCells(int n) {
        long numBlueCells = 1;
        int addend = 4;

        // Iterate n - 1 times
        while (--n > 0) {
            // Add and update current multiple of 4
            numBlueCells += addend;
            addend += 4;
        }
        return numBlueCells;
    }
}