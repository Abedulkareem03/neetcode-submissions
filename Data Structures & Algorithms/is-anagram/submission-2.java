class Solution {
    public boolean isAnagram(String s, String t) {
        int[] hist1 = new int[26];
        int[] hist2 = new int[26];
        for (char c : s.toCharArray()) hist1[c - 'a']++;
        for (char c : t.toCharArray()) hist2[c - 'a']++;

        for (int i = 0; i < 26; i++){
            if (hist1[i] != hist2[i]){
                return false;
            }
        }
        return true;
    }
}
