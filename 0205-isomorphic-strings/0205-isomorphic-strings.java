class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> alpha = new HashMap<>();
        for(int i = 0 ; i <s.length() ; i++){
            if(alpha.containsValue(t.charAt(i))){
                continue ;
            }else{
                alpha.put(s.charAt(i),t.charAt(i));
            }            
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i <s.length() ;i++){
            sb.append(alpha.get(s.charAt(i)));
        }
        return(sb.toString().equals(t));        
    }
}