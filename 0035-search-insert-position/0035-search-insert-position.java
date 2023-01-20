class Solution {
    public int searchInsert(int[] nums, int target) {
        int max=nums.length-1;
        int min=0;
        int pos=0;
        while(max>min){
            pos=(max+min)/2;
            if(nums[pos]==target){
                return pos;
            }
            else if(nums[pos]>target){
                max=pos-1;
            }
            else{
                min=pos+1;
            }
        }
        if(target>nums[min]){
            return min+1;
        }else{
            return min;
        }
    }
}