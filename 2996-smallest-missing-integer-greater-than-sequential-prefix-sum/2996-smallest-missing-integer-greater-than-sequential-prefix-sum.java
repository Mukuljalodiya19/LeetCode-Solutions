class Solution {
    public int missingInteger(int[] nums) {
        
        
         int n = nums.length;
       int prefixSum = nums[0];

         HashSet<Integer> set = new HashSet<>();

          for(int x : nums){
            set.add(x);
          }

         for(int i = 1; i < n ; i++){
            if(nums[i]== nums[i-1]+1){
                prefixSum+=nums[i];
            }else{
                break;
            }
         }
         while(set.contains(prefixSum)){
            prefixSum++;
         }
         return prefixSum;
    }
}