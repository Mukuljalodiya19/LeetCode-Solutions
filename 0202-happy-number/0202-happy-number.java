class Solution {
    public boolean isHappy(int n) {
        
    int slow = n;
    int fast = n ;
       
       do {
        slow =  digitSquareSum(slow);
        fast =  digitSquareSum( digitSquareSum(fast));

       }
       while(slow != fast);
       if (slow == 1){
        return true;
       }else{ 
        return false;
       }

    }
    int digitSquareSum(int n){
        int sum = 0;
        while (n > 0 ){
            int rem = n %10 ;
            sum = sum + (int)Math.pow(rem , 2);
            n = n/10;
        }
        return sum;
    }
}