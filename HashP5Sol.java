class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int longestSequence = 0;

        // Add all elements of nums array into the HashSet
        for (int num : nums) {
            numSet.add(num);
        }

        for (int num : numSet) {
            // Check if the current number is the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentSequence = 1;

                // Increment the current number to find consecutive elements
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentSequence += 1;
                }

                // Update the longest sequence length
                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }

        return longestSequence;
        
    }
}