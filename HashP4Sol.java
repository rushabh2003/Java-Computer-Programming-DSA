import java.util.PriorityQueue;

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of each number
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Custom comparator to sort based on frequency and value
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> a.getValue() == b.getValue() ? Integer.compare(b.getKey(), a.getKey()) : Integer.compare(a.getValue(), b.getValue())
        );

        pq.addAll(freqMap.entrySet());

        int index = 0;
        while (!pq.isEmpty()) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            int frequency = entry.getValue();
            int number = entry.getKey();
            
            while (frequency-- > 0) {
                nums[index++] = number;
            }
        }

        return nums;
        
    }
}