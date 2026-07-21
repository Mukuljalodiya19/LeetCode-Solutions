class Solution {
    public List<Integer> findDuplicates(int[] nums) {
   
Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    
}
}