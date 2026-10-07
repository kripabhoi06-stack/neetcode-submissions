class Solution {
    public int[] productExceptSelf(int[] nums) {
       int leftproduct=1;
       int n=nums.length;
       int[] left=new int[n];
       int[] right=new int[n];
       int[] result=new int[n];
        for(int i=0;i<n;i++){
                left[i]=leftproduct;
                leftproduct=leftproduct*nums[i];
        }
        int rightproduct=1;
        for(int i=n-1;i>=0;i--){
            right[i]=rightproduct;
            rightproduct=rightproduct*nums[i];
        }
        for(int i=0;i<n;i++){
        result[i]=left[i]*right[i];
        }
        return result;
        
    }
}  
