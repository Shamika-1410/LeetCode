class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<=n-3;i++){
            char a = sb.charAt(i);
            char b = sb.charAt(i+1);
            char c = sb.charAt(i+2);
            if(a==b && b==c && a==c){
                sb.deleteCharAt(i);
                n--;
                i--;
            }
        }
        return sb.toString();
    }
}