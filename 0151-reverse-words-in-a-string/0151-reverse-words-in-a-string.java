class Solution {
    public String reverseWords(String s) {
          StringBuilder ans = new StringBuilder();
      
      while(true){
          s = s.trim();
          
          int lastSpace = s.lastIndexOf(' ');
          if (lastSpace ==-1){
              ans.append(s);
              break;
          }
          
          String lastWord = s.substring(lastSpace+1);
          ans.append(lastWord+" ");
          s = s.substring(0 , lastSpace);
      }
      
      return ans.toString();
}
    }
