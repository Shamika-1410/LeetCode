class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2){
        int ans[] = new int[nums1.length];
        Map<Integer,Integer> map = new HashMap<>(nums2.length);
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        for(int i=nums2.length-1;i>=0;i--){
            int tos = -1;
            if(!st.isEmpty()){
                if(st.peek()>nums2[i]){
                    tos = st.peek();
                }else{
                    while(!st.isEmpty() && st.peek()<nums2[i]){
                        st.pop();
                    }
                    if(!st.isEmpty()){
                        tos=st.peek();
                    }
                }
            }
            map.put(nums2[i],tos);
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}