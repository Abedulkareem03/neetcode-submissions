class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // key   -> number value
        // value -> index

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i]; // we calculate the difference

            if (map.containsKey(difference)) { // if we found it so we will return the indicies
                return new int[] { map.get(difference), i };
            }

            map.put(nums[i], i); // else we will add them 
        }

        return new int[] {}; // guaranteed solution exists, so this won't be reached
    }
}
