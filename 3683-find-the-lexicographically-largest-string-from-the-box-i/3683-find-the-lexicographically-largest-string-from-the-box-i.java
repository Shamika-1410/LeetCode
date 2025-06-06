class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends == 1){
            return word;
        }
        int n = word.length();
        String ans = "";
        for(int i=0;i<n;i++){
            String s = word.substring(i,Math.min(i+n-numFriends+1,n));
            if(ans.compareTo(s)<=0){
                ans=s;
            }
        }
        return ans;
    }
}