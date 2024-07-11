class Solution {
    public String reverseParentheses(final String s) {
        final Stack<Integer> open = new Stack<>();
        final int[] pIdx = new int[s.length()];

        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == '(') {
                open.push(i);
            } else if(s.charAt(i) == ')') {
                int j = open.pop();

                pIdx[i] = j;
                pIdx[j] = i;
            }
        }

        final StringBuilder sb = new StringBuilder();
        for(int i = 0, d = 1; i < s.length(); i += d){
            if(s.charAt(i) == '(' || s.charAt(i) == ')') {
                i = pIdx[i];
                d = -d;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}