class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] res=new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
           int d=target-nums[i]; 
            if(map.containsKey(d)){
                res[0]=map.get(d);
                res[1]=i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}

    
