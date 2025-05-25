class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        //System.out.println(Arrays.toString(freq));
        n = t.length();
        for(int i=0;i<n;i++){
            freq[t.charAt(i)-'a']--;
        }
        char b = '0';
        for(int i=0;i<26;i++){
            if(freq[i]==-1){
                b = (char)(97+i);
                break;
            }
        }
        //System.out.println(Arrays.toString(freq));
        return b;
    }
}