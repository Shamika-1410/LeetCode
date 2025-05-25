class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        s = new String(s1);
        char[] t1 = t.toCharArray();
        Arrays.sort(t1);
        t = new String(t1);
        return s.equals(t);
    }
}