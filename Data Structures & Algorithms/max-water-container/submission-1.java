class Solution {
    public int maxArea(int[] heights) {
        if (heights.length == 2) {
            return Math.min(heights[0] , heights[1]);
        }
        int left = 0; 
        int right = heights.length - 1;

        int maxArea = 0;
        while (left < right) {
            int width = right - left;
            int height = Math.min(heights[left],heights[right]);
            int area = width * height;
            
            if(area > maxArea) {
                maxArea = area;
            }
            if(heights[left] < heights[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea; 
    }
}
