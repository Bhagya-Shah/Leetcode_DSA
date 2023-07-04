class Solution {
    public int singleNumber(int[] nums) {
        int o=0,t=0;
        for(int num:nums){
            o=(o^num)&(~t);
            t=(t^num)&(~o);
        }
        return o;
    }
}