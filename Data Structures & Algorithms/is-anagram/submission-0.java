class Solution {
    public boolean isAnagram(String s, String t) {
     int[] hist = new int[26];
     fillStringIntoHist(s,hist);
     substractStringFromHist(t,hist);
    
    return allZeros(hist);

    }
    public boolean allZeros(int[] hist) {
        for (int i = 0; i < hist.length; i++){
            if (hist[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public void fillStringIntoHist (String s , int[]hist) {
        for (char c : s.toCharArray()) {
           hist[c - 'a']++;
           }

    }
    public void substractStringFromHist (String s , int[]hist) {
        for (char c : s.toCharArray()) {
           hist[c - 'a']--;
           }
    }

}
