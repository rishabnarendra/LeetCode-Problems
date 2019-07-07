class Solution {
    public int reverse(int x) {
        int reverse = 0;

        while(x != 0) {
            int y = reverse*10 + x%10;
            if ((y - x%10)/10 != reverse) return 0;
            else reverse = y;
            x = x/10;   
        }
        return reverse;
    }
}