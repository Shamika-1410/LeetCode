class Solution {
    public String robotWithString(String s) {
        int[] freq = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            freq[c-'a']++;
        }
        Stack<Character> st = new Stack<>();
        StringBuilder t = new StringBuilder();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            st.push(c);
            freq[c-'a']--;
            while(!st.isEmpty() && st.peek() <= smallestChar(freq)){
                t.append(st.pop());
            }
        }
        while(!st.isEmpty()){
            t.append(st.pop());
        }
        return t.toString();
    }
    private char smallestChar(int[] freq){
        for(int i=0;i<26;i++){
            if(freq[i] >0){
                return (char)('a'+i);
            }
        }
        return 'a';
    }
}