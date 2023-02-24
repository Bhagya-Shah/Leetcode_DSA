/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

// f f f f f f t t t 

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int h=n,l=1;
        while(l<=h){
            int m=l+(h-l)/2;
            boolean ans=isBadVersion(m);
            if(ans && !isBadVersion(m-1)){
                return m;
            }
            if(!ans){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return -1;
    }
}