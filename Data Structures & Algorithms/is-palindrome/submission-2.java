class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ss = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                ss.append(Character.toLowerCase(c));
            }
        }
        return ss.toString().equals(ss.reverse().toString());
        
    }
}
