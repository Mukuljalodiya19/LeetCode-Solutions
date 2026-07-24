class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.trim();
        int lastSpace = s.lastIndexOf(' ');

         String lastWord = s.substring(lastSpace+1);
         return lastWord.length();
    }
 
}