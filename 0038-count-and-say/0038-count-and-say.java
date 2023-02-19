class Solution {
    public String process(String s){
        char c=s.charAt(0);
        int count=1;
        StringBuilder ans=new StringBuilder("");
        for(int i=1;i<s.length();i++){
            char d=s.charAt(i);
            if(c==d){
                count++;
            }else{
                ans.append(count);
                ans.append(c);
                c=s.charAt(i);
                count=1;
            }
        }
        ans.append(count);
        ans.append(c);
        return ans.toString();
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