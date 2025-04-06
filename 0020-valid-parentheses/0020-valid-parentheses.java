class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }else{
                if(st.isEmpty()) return false;
                char ch = st.peek();
                if((c==')' && ch=='(') || (c==']' && ch=='[') || (c=='}' && ch=='{')){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}