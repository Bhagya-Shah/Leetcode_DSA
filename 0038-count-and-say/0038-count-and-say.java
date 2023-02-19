class Solution {
    public String process(String s){
        char c=s.charAt(0);
        int count=1;
        String ans="";
        for(int i=1;i<s.length();i++){
            char d=s.charAt(i);
            if(c==d){
                count++;
            }else{
                ans=ans+count+c;
                c=s.charAt(i);
                count=1;
            }
        }
        ans=ans+count+c;
        return ans;
    }
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String a="11";
        for(int i=3;i<=n;i++){
            String b=process(a);
            a=b;
        }
        return a;
    }
}