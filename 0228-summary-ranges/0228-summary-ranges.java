class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        if(nums.length==1){
            ans.add(nums[0]+"");
            return ans;
        }
        int c=0,i=0;
        for(i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                c++;
            }else{
                if(c==0){
                    ans.add(nums[i]+"");
                }else{
                    ans.add(nums[i-c]+"->"+nums[i]);   
                }
                c=0;
            }
        }
        if(c>0){
            ans.add(nums[i-c]+"->"+nums[i]);
            return ans;
        }
        if(nums.length>1 && nums[i]-nums[i-1]!=1){
            ans.add(nums[i]+"");
        }
        
        return ans;
    }
}