class Solution { 
    public void permutation(String s,List<String> ans,String sb,int i){
        if(s.length()==sb.length()){
            ans.add(sb);
            return;
        }
        if(s.charAt(i)>=48 && s.charAt(i)<=57){
            permutation(s,ans,sb+s.charAt(i), i+1);
        }else{
            permutation(s,ans,sb+s.charAt(i), i+1);
            if(s.charAt(i)>=97){
                permutation(s,ans,sb+(char)(s.charAt(i)-32), i+1);
            }else{
                permutation(s,ans,sb+(char)(s.charAt(i)+32), i+1);
            }
        }
    }
    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        permutation(s,ans,"",0);
        return ans;
    }
}