class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],1);
        }
        int longest=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];

            if(!map.containsKey(num-1)){
                int count=1;
                int smallest=num;

                while(map.containsKey(smallest+1)){
                    smallest++;
                    count++;
                }
                if(count>longest){
                    longest=count;
                }
            }
        }
        return longest;
    }
}
