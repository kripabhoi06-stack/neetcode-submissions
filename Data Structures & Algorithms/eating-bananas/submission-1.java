class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = piles[0];

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > right) {
                right = piles[i];
            }
        }

        int answer = right;

        while (left <= right) {

            int hours = 0;

            int mid = (left + right) / 2;

            for (int i = 0; i < piles.length; i++) {
                hours = hours + (piles[i] + mid - 1) / mid;
            }

            if (hours <= h) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}