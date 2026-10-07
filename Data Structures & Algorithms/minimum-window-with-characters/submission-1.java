class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int count = t.length();

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            if (map.containsKey(c)) {

                if (map.get(c) > 0) {
                    count--;
                }

                map.put(c, map.get(c) - 1);
            }

            while (count == 0) {

                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {

                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0) {
                        count++;
                    }
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}