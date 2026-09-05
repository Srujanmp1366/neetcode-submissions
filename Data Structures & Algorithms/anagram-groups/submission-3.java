class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
        Map<String,List<String>> mpp=new HashMap<>();
        
        for(String s:strs){
            int[] count=new int[26];
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            String key=Arrays.toString(count);
            mpp.putIfAbsent(key,new ArrayList<>());
            mpp.get(key).add(s);
        }
        return new ArrayList<>(mpp.values());

    }
}
