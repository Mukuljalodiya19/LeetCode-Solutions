class Solution {
    public int maxVowels(String s, int k) {
          Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int maxCount = 0; 
        int currentCount =0;
        int n = s.length();

        for(int i=0; i<k; i++){
            if(vowels.contains(s.charAt(i)))
            currentCount++;
        }
       maxCount = currentCount;

    for(int i = k; i<n;i++){
           if(vowels.contains(s.charAt(i)))
           currentCount++;
        if(vowels.contains(s.charAt(i-k)))
        currentCount--;
        maxCount = Math.max(maxCount,currentCount);

    }
    return maxCount;
}
}