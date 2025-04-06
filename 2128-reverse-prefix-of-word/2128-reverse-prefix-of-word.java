class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int n = word.length();
        int idx = -1;
        for (int i=0;i<n; i++) {
            char c = word.charAt(i);
            sb.append(c);
            if(c==ch){
                idx=i;break;
            }
        }
        if(idx==-1)return word;
        sb.reverse();
        for (int i=idx+1;i<n; i++) {
            char c = word.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }
}