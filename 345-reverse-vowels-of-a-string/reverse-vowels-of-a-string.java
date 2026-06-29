class Solution {
    public String reverseVowels(String s) {


        char[] arr = s.toCharArray();
        int left = 0,right = arr.length-1;

        while(left < right){
       while(left<right && !isVowel(arr[left])) left++;
          while(left<right && !isVowel(arr[right])) right--;

          char temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;

          left++;
          right--;
        }
        return new String(arr);
    }
     public boolean isVowel(char c){
            switch(c){
                   case 'a': case 'e': case 'i': case 'o': case 'u':
             case 'A': case 'E': case 'I': case 'O': case 'U':
            return true;
            default:return false;
}
     }
}