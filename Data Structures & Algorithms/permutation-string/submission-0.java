class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;

        while (right < s2.length()) {

            char c = s2.charAt(right);
            map2.put(c, map2.getOrDefault(c, 0) + 1);

        
            if (right - left + 1 > s1.length()) {

                char remove = s2.charAt(left);

                map2.put(remove, map2.get(remove) - 1);

                if (map2.get(remove) == 0) {
                    map2.remove(remove);
                }

                left++;
            }

            
            if (right - left + 1 == s1.length()) {

                if (map1.equals(map2)) {
                    return true;
                }
            }

            right++;
        }

        return false;
    }
}