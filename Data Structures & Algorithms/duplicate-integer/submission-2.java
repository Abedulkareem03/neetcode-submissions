class Solution {
    public boolean hasDuplicate(int[] nums) {
     HashSet<Integer> numsMap = new HashSet<>();  
        for (int i = 0; i < nums.length; i++){
            if (numsMap.contains(nums[i])){
                return true;
            }
            else{
                numsMap.add(nums[i]);
            }
        }
        return false;
    }
}