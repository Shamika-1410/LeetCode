class Solution {
    public int trap(int[] h) {
        int leftmax=0,rightmax=0,ans=0;
        int l=0,r=h.length-1;
        while(l<r){
            if(h[l]<=h[r]){
                if(leftmax>h[l]){
                    ans+=(leftmax-h[l]);
                }else{
                    leftmax=h[l];
                }
                l++;
            }else{
                if(rightmax>h[r]){
                    ans+=(rightmax-h[r]);
                }else{
                    rightmax=h[r];
                }
                r--;
            }
        }
        return ans;
    }
}