class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int white = 0;
        int black = 0;
        for(int i=0;i<k;i++){
            char c = blocks.charAt(i);
            if(c=='W')white++;
            else black++;
        }
        int minOp = white;
        int left = 0;
        int right = k;
        while(right<n){
            if(blocks.charAt(left)=='W')white--;
            else black--;
            if(blocks.charAt(right)=='W')white++;
            else black++;
            if(white<minOp) minOp=white;
            left++;
            right++;
        }
        return minOp;
    }
}