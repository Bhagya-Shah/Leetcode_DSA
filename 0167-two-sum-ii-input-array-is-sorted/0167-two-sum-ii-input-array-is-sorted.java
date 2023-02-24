class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        if(numbers.length==2){
            ans[0]=1;
            ans[1]=2;
            return ans;
        }

        int l=0,r=numbers.length-1;
        while(l<=r){
            if(target==numbers[l]+numbers[r]){
                ans[0]=l+1;
                ans[1]=r+1;
                return ans;
            }
            else if(target<numbers[l]+numbers[r]){
                r--;
            }else{
                l++;
            }
        }
        ans[0]=l+1;
        ans[1]=r+1;
        return ans;
    }
}