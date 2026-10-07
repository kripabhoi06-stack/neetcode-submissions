class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

       
        for(int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } 
            else {
                map.put(nums[i], 1);
            }
        }

        
        while(k > 0) {

            int maxFreq = 0;
            int number = 0;

            for(int num : map.keySet()) {

                if(map.get(num) > maxFreq) {
                    maxFreq = map.get(num);
                    number = num;
                }
            }

            ans.add(number);
            map.remove(number);
            k--;
        }

       
        int[] result = new int[ans.size()];

        for(int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}