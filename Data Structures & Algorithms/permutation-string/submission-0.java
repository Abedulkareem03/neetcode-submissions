class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 > n2) return false;

        int[] need = new int[26];
        int[] window = new int[26];

        // histogram for s1
        for (int i = 0; i < n1; i++) {
            need[s1.charAt(i) - 'a']++;
        }

        // initial window in s2 (size n1)
        for (int i = 0; i < n1; i++) {
            window[s2.charAt(i) - 'a']++;
        }

        if (same(need, window)) return true;

        // slide the window across s2
        for (int right = n1; right < n2; right++) {
            window[s2.charAt(right) - 'a']++;          // add new char
            window[s2.charAt(right - n1) - 'a']--;     // remove old char (left side)

            if (same(need, window)) return true;
        }

        return false;
    }

    private boolean same(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
