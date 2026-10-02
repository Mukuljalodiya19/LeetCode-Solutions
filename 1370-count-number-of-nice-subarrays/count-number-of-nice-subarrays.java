class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int prefix = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2!=0){
                prefix++;
            }
            if(map.containsKey(prefix-k)){
                count+=map.get(prefix-k);
            }
            map.put(prefix , map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}