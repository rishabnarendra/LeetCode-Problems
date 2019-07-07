class Solution {
    public int romanToInt(String s) {
        int total = 0, current = 0, next = 0; 
        for(int i = 0; i < s.length(); i++) {
            current = valueOfRoman(s.charAt(i)); 
            if(i != s.length() - 1) next = valueOfRoman(s.charAt(i + 1));
            else {
                total += current; 
                return total; 
            }
            if(current >= next) {
                total += current; 
            }
            else {
                total += next - current; 
                i++; 
            }
        }
        return total; 
    }
    
    public int valueOfRoman(char roman) {
        if(roman == 'I') return 1; 
        else if(roman == 'V') return 5;
        else if(roman == 'X') return 10;
        else if(roman == 'L') return 50; 
        else if(roman == 'C') return 100; 
        else if(roman == 'D') return 500; 
        else if(roman == 'M') return 1000; 
        return 0; 
    }
}