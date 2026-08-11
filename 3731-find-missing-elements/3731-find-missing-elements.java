class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;;

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<n ; i++){
            min = Math.min(min ,nums[i]);
            max = Math.max(max , nums[i]);
            set.add(nums[i]);
        }

        List<Integer> ans = new ArrayList<>();
        
        for(int i = min+1 ;i<max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
            
        }
        return ans;
    }
}