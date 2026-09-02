class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> s_map=new HashMap<>();
          Map<Character,Integer> t_map=new HashMap<>();
       
        if(s.length()!=t.length()){
            return false;
        }
       
            for(int i=0;i<s.length();i++){
               
                s_map.put(s.charAt(i),s_map.getOrDefault(s.charAt(i),0)+1);
                t_map.put(t.charAt(i),t_map.getOrDefault(t.charAt(i),0)+1);

            }
        
            return s_map.equals(t_map);
           
    }
}
