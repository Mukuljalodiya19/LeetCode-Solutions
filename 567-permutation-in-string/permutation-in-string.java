class Solution {
    public boolean checkInclusion(String s1, String s2) {

          if (s1.length() > s2.length()) {
            return false;
        }  
           int[] arr1 = new int[26];
           int[] arr2 = new int[26];
    

    for (int i = 0;i<s1.length();i++){
      arr1[s1.charAt(i)-'a']++;

    }
    int left = 0;
    for(int right= 0; right<s2.length(); right++){
        arr2[s2.charAt(right)-'a']++;
        while(right-left+1>=s1.length()){
            boolean t = isMatched(arr1,arr2);
            if(t){
                return true;
            }
             arr2[s2.charAt(left)-'a']--;
             left++;
        }
     
    }

    return false;
}     
   private boolean isMatched(int[] arr1, int[] arr2) {
    for (int i = 0; i < 26; i++) {
        if (arr1[i] != arr2[i]) {
            return false;
        }
    }
    return true;
}
}
