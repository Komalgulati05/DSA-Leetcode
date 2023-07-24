class Solution {
    public int removeElement(int[] nums, int val) {
        int j=nums.length-1;
        int k=0,temp=0;
        for(int i=0;i<=j;){
            if(nums[i]==val){               
                 nums[i]=nums[j];
               
                 j--;
                k++;
            }
            else{
                i++;
            }
        }
        return nums.length-k;
    }
}