class Solution {
    public boolean ispivot(int[] nums,int index){
        int ls=0,rs=0;
        for(int i=0;i<index;i++){
            ls+=nums[i];
        }
        for(int i=nums.length-1;i>index;i--){
            rs+=nums[i];
        }
        if(ls==rs){
            return true;
        }
        return false;
    }
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(ispivot(nums,i)){
                return i;
            }
        }
        return -1;
    }
}