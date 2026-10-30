class Solution {
    public boolean isAnagram(String s, String t) {
         
        if (s.length() > t.length()) {
            return false;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < t.length(); i++) {
            arr1[t.charAt(i) - 'a']++;
        }
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
           arr2[s.charAt(right) - 'a']++;
            while (right - left + 1 >= t.length()) {
                if (Arrays.equals(arr1, arr2)) {
                    return true;
                }
                arr2[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return false;
    }
}

