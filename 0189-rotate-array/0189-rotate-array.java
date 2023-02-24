class Solution {
    public void reverseOrder(int nums[],int s,int e){
        for(int i=s,j=e;i<=j;i++,j--){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverseOrder(nums,0,nums.length-k-1);
        reverseOrder(nums,nums.length-k,nums.length-1);
        reverseOrder(nums,0,nums.length-1);
    }
}