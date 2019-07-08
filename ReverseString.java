class Solution {
    public void reverseString(char[] s) {
        int endIndex = s.length - 1; 
        for(int i = 0; i < s.length / 2; i++) {
            char temp = s[i]; 
            s[i] = s[endIndex]; 
            s[endIndex] = temp;
            endIndex--;
        }
    }
}