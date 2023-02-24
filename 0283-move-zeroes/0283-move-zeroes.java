class Solution {
    public void moveZeroes(int[] nums) {
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                p++;
            }else if(p>0){
                int t=nums[i];
                nums[i]=0;
                nums[i-p]=t;
            }
        }
    }
}