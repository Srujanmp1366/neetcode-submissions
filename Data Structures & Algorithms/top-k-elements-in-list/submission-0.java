class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer,Integer> map=new HashMap<>();
    for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
    }
 

    int count = 0;
    int[] res=new int[k];
    while(count<k){
   
    Map.Entry<Integer, Integer> maxEntry = Collections.max(
    map.entrySet(), 
    Map.Entry.comparingByValue());

    res[count]=maxEntry.getKey();
    map.remove(maxEntry.getKey(),maxEntry.getValue());
    count++;
}

return res;
        
    }
}
