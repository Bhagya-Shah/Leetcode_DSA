class Solution {
    public void reverseString(char[] s) {
        for(int i=0,j=s.length-1;i<s.length/2;i++,j--){
            char t=s[i];
            s[i]=s[j];
            s[j]=t;
        }
    }
}