class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      // intuition - binary search rows then binary search target
      int leftR = 0;
      int rightR = matrix.length - 1;
      int n = matrix[0].length;
      
      int midR = (leftR + rightR) / 2;

      while (leftR <= rightR) {
        midR = (leftR + rightR) / 2;
        if(matrix[midR][0] <= target && target <= matrix[midR][n-1]) {
            break; //quit this loop to join the other loop
              }
        else if (matrix[midR][0] > target) {
            rightR = midR - 1;
             }
        else if (matrix[midR][n-1] < target) {
            leftR = midR + 1;
              }
      }
      // after finding correct row, binary search for target
      int left = 0;
      int right = n - 1;
      while (left <= right) {
        int mid = left + (right - left) / 2; // avoids overflow
        if (matrix[midR][mid] == target) {
            return true;           // found
        } else if (matrix[midR][mid] < target) {
            left = mid + 1;       // search right half
        } else {
            right = mid - 1;      // search left half
        }
      }
      return false;
    }
}

