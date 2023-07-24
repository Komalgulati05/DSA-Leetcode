class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;){
            if(nums[i]==nums[j]){
                i++;
                
            }else{
             j++;
            nums[j]=nums[i];   
            }
            
        }
        return j+1;
    }
}