class Solution {
    public boolean ispivot(int[] nums,int index,int sum){
        int ls=0;
        for(int i=0;i<index;i++){
            ls+=nums[i];
        }
        if(ls==sum-ls-nums[index]){
            return true;
        }
        return false;
    }
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i:nums) sum+=i;
        for(int i=0;i<nums.length;i++){
            if(ispivot(nums,i,sum)){
                return i;
            }
        }
        return -1;
    }
}