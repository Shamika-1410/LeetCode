class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            st.push(nums[i]);
        }
        int ans[] = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            int tos = -1;
            if(!st.isEmpty()){
                if(st.peek()>nums[i]){
                    tos = st.peek();
                }else{
                    while(!st.isEmpty() && st.peek()<=nums[i]){
                        st.pop();
                    }
                    if(!st.isEmpty()){
                        tos=st.peek();
                    }
                }
            }
            ans[i]=tos;
            st.push(nums[i]);
        }
        return ans;
    }
}