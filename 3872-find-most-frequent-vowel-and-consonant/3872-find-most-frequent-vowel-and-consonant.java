class Solution {
    public static int maxFreqSum(String s) {
        Map<Character, Integer> vowel = new HashMap<>();
        Map<Character, Integer> consonant = new HashMap<>();
        int n = s.length();
        int cntV=0, cntC=0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(isVowel(c)){
                vowel.put(c,vowel.getOrDefault(c,0)+1);
                cntV = Math.max(cntV,vowel.get(c));
            }else{
                consonant.put(c,consonant.getOrDefault(c,0)+1);
                cntC = Math.max(cntC,consonant.get(c));
            }
        }
        return cntV+cntC;
    }
    public static boolean isVowel(char c){
        return (c=='a') || (c=='e') || (c=='i') || (c=='o') || (c=='u');
    }
}