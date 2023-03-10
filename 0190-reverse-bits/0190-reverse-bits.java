public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        // return Integer.reverse(n);
        if(n==0){
            return 0;
        }
        int ans=0;
        for(int i=0;i<32;i++){
            ans<<=1;
            if((n&1)==1){
                ans++;
            }
            n>>=1;
        }
        return ans;
    }
}