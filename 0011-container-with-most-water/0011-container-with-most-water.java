class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int leftPtr = 0;
        int rightPtr = height.length -1;
        while(leftPtr<rightPtr){
            int ht = Math.min(height[leftPtr],height[rightPtr]);//1,7,3,8
            int width = rightPtr-leftPtr;//8,7,6,5
            int water = ht*width;//8,49,18,40
            maxWater = Math.max(maxWater,water);//8,49,49,49
            if(height[leftPtr]<height[rightPtr]){
                leftPtr++;
            }else{
                rightPtr--;
            }
        }
        return maxWater;
    }
}