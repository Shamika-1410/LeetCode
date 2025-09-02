class Solution {
    public int ladderLength(String start, String end, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        if(!dict.contains(end))return 0;
        Queue<Pair <String, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(start,1));
        while(!queue.isEmpty()){
            Pair<String, Integer> p = queue.poll();
            String word = p.getKey();
            int steps = p.getValue();
            if(word.equals(end)) return steps;
            char[] arr = word.toCharArray();
            for(int i=0;i<arr.length;i++){
                char og = arr[i];
                for(char c='a';c<='z';c++){
                    arr[i] = c;
                    String newWord = new String(arr);
                    if(newWord.equals(end)) return steps + 1;
                    if(dict.contains(newWord)){
                        queue.offer(new Pair<>(newWord,steps+1));
                        dict.remove(newWord);
                    }
                }
                arr[i] = og;
            }
        }
        return 0;
    }
}