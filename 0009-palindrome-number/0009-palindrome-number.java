class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0){
            return false;
        }
        int org = x;
        int ans = 0;
        while(x != 0){
            int num = x % 10;
            ans = (ans * 10) + num;
            x = x / 10;
        }
        if ( org == ans){
            return true;
        }else{
            return false;
        }
    }
}