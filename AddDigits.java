class Solution {
    public int addDigits(int num) {
        if(String.valueOf(num).length() == 1) return num; 
        int total = 0; 
        while(num != 0) {
            int current = num % 10; 
            total += current; 
            num = num / 10; 
        }
        return addDigits(total); 
    }
}