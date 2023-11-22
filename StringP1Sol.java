class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int needleLength = needle.length();
        int haystackLength = haystack.length();

        if (needleLength > haystackLength) {
            return -1;
        }

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }

        return -1;

    }
}