class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int nums : arr){
            map.put(nums, map.getOrDefault(nums , 0)+1);
        }

        Set <Integer> set = new HashSet<>();
       for(int count : map.values()){
        if(!set.add(count)){
            return false;
        }
       }
       return true;
         
        }
}
