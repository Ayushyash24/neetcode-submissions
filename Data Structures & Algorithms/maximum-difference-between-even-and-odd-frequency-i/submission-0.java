class Solution {
    public int maxDifference(String s) {

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                minEven = Math.min(minEven, count);
            } else {
                maxOdd = Math.max(maxOdd, count);
            }
        }

        return maxOdd - minEven;
    }
}