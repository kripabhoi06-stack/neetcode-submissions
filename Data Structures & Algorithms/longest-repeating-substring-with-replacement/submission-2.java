class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            int maxfreq = 0;

            for(int num : map.values()) {
                if(num > maxfreq) {
                    maxfreq = num;
                }
            }

            int windowLength = right - left + 1;

            if(windowLength - maxfreq <= k) {

                maxLength = Math.max(maxLength, windowLength);

            } else {

                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
        }

        return maxLength;
    }
}