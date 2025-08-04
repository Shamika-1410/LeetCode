class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;
        int n = moves.length();
        for(int i=0;i<n;i++){
            char c = moves.charAt(i);
            if(c=='U')up++;
            else if(c=='D')down++;
            else if(c=='L')left++;
            else right++;
        }
        if(up>0 || down>0){
            if(up!=down)return false;
        }
        if(left>0 || right>0){
            if(left!=right)return false;
        }
        return true;
    }
}