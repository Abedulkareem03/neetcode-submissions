class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     // create a frequency map such that <value , freq>
     Map <Integer , Integer> freqMap = new HashMap<>();
      for (int i = 0; i < nums.length; i++){
        freqMap.put(nums[i], freqMap.getOrDefault(nums[i] , 0) + 1);
      }
      // create buckets
      List<Integer>[] buckets = new List[nums.length + 1];
      for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) { //iterate though entries 
        int num = entry.getKey();
        int freq = entry.getValue();

        if (buckets[freq] == null) { //check if current buckets frequency exists or not 
            buckets[freq] = new ArrayList<>(); // if not create a new one
            }

       buckets[freq].add(num); // else add it to the current bucket
        }
        int[] res = new int [k];
        int idx = 0;

      for (int f = buckets.length - 1; f >= 0 && idx < k; f--) {
         if (buckets[f] == null) continue;

         for (int num : buckets[f]) {
           res[idx++] = num;
           if (idx == k) break;
            }
        }
    return res;
    }
}
