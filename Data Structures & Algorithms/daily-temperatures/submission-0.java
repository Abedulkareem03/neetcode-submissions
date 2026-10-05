class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] res = new int [temperatures.length];
        Deque<int[]> minStack = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) { //we add all the minmimums in one stack
            while (!minStack.isEmpty() && temperatures[i] > minStack.peek()[1]) {
                int[] stackTopIndx = minStack.pop();
                res[stackTopIndx[0]] = i - stackTopIndx[0];
            }
            minStack.push(new int[] {i,temperatures[i]});
        }
    return res;
    }
}
