class Solution {
    public String reverse(String a){
        StringBuilder t=new StringBuilder("");
        for(int j=a.length()-1;j>=0;j--){
            t.append(a.charAt(j));
        }
        return t.toString();
    }
    
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder("");
        String arr[]=s.split(" ");
        for(String a:arr){
            sb.append(reverse(a));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();   
    }
}