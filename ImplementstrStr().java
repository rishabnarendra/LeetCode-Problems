class Solution {
    public int strStr(String haystack, String needle) {
        if(needle=="" || haystack=="") return 0;
        int len = needle.length();
        
        for(int i=0;i<haystack.length()-len+1;i++) {
            String sub = haystack.substring(i,i+len);
            if(sub.equals(needle))
                return i;
        }
        return -1;
    }
}