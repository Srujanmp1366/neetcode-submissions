class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int count=mpp.getOrDefault(nums[i],0)+1;
            mpp.put(nums[i],count);
        }
        boolean flag=false;
        for(int i=0;i<mpp.size();i++){
            if(mpp.get(nums[i])>1){
                flag=true;
                break;
            }
        }
        return flag;
    }
}