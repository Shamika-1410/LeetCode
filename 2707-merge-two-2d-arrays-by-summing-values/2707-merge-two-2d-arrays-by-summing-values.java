class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
       int r1=0,r2=0;
       ArrayList<int[]> list = new ArrayList<>();
       while(r1<nums1.length && r2<nums2.length){
        if(nums1[r1][0]==nums2[r2][0]){
            nums1[r1][1]=nums1[r1][1]+nums2[r2][1];
            list.add(nums1[r1]);
            r1++;r2++;
        }else{
            if(nums1[r1][0]<nums2[r2][0]){
                list.add(nums1[r1]);
                r1++;
            }else{
                list.add(nums2[r2]);
                r2++;
            }
        }
       }
       while(r1<nums1.length){
        list.add(nums1[r1]);
        r1++;
       }
       while(r2<nums2.length){
        list.add(nums2[r2]);
        r2++;
       }
       int[][] twoDArray = list.toArray(new int[list.size()][2]);
       return twoDArray;
    }
}