class Solution {
    private boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    private String devowel(String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(isVowel(c)) sb.append('*'); 
            else sb.append(c);
        }
        return sb.toString();
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>();
        Map<String, String> lowerMap = new HashMap<>();  
        Map<String, String> vowelMap = new HashMap<>();   

        for (String w : wordlist) {
            exact.add(w);                       
            String lower = w.toLowerCase();
            lowerMap.putIfAbsent(lower, w);     
            String dev = devowel(lower);
            vowelMap.putIfAbsent(dev, w);
        }

        String[] ans = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (exact.contains(q)) {
                ans[i] = q;                    
                continue;
            }
            String lowerQ = q.toLowerCase();
            if (lowerMap.containsKey(lowerQ)) {
                ans[i] = lowerMap.get(lowerQ);  
                continue;
            }
            String devQ = devowel(lowerQ);
            ans[i] = vowelMap.getOrDefault(devQ, "");
        }

        return ans;
    }
}
