class Solution {
    public boolean isPalindrome(int x) {
        int x_copy = x; 
        int reverse = 0;
        while(x != 0) {
            reverse = reverse*10 + x%10;
            x = x/10;   
        } 
        if(reverse == x_copy && x_copy >= 0)
            return true;
        return false; 
    }
}