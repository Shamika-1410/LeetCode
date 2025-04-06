class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2){
        int ans[] = new int[nums1.length];
        Map<Integer,Integer> map = new HashMap<>(nums2.length);
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        map.put(nums2[n-1],-1);
        st.push(nums2[n-1]);
        int tos=0;
        for(int i=n-2;i>=0;i--){
            if(st.isEmpty()){
                tos=-1;
            }else{
                tos=st.peek();
            }
            if(tos>nums2[i]){
                map.put(nums2[i],tos);
            }else{
                while(tos<nums2[i] && !st.isEmpty()){
                    st.pop();
                    if(st.isEmpty()){
                        tos=-1;break;
                    }else{
                        tos=st.peek();
                    }
                }
                map.put(nums2[i],tos);
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}