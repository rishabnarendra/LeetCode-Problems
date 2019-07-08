class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        s.toLowerCase();
        t.toLowerCase();
        char[] word1 = s.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = t.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}