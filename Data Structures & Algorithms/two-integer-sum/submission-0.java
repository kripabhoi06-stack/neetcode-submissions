class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int comment=target-nums[i];
        if(map.containsKey(comment)){
            return new int[]{map.get(comment),i};
        }
        map.put(nums[i],i);
      }

      return new int[]{};
    }
}
