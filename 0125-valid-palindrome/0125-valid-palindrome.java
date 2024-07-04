class Solution {
    public static boolean isPalindrome(String sk) {
        sk=sk.trim();
        sk=sk.toLowerCase();
        int k=sk.length();
        String s = "";
        for(int j=0;j<k;j++){
            char c = sk.charAt(j);
            if((c>='a' && c<='z')|| (c>='0' && c<='9')){
                s+=c;
            }
        } 
        String sn = "";
        int i = s.length()-1;
        if(s.equals(reverse(sn,s,i))){
            return true;
        }
        // System.out.println(reverse(sn,s,i));
        return false; 
    }
    static String reverse(String sn,String s,int i){
        if(i<0){
            return sn;
        }
        sn+=s.charAt(i);
        return reverse(sn,s,i-1);
    }
}