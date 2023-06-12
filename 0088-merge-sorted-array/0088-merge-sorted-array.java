class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans=new int[m+n];
        int i=0,j=0,k=0;
        while(m>i && n>j){
            if(nums1[i]<nums2[j]){
                ans[k]=nums1[i];
                i++;
                k++;
            }else{
                ans[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(m>i){
            ans[k]=nums1[i];
            i++;
            k++;
        }
        while(n>j){
            ans[k]=nums2[j];
            j++;
            k++;
        }
        for(i=0;i<m+n;i++){
            nums1[i]=ans[i];
        }
    }
}