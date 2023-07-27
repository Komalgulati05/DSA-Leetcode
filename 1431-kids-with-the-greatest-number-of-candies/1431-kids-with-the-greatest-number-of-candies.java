class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result=new ArrayList<>();
        int add=0;
        int max=-1;
        for(int i=0;i<candies.length;i++){           
            max=Math.max(max,candies[i]);
        }
            for(int j=0;j<candies.length;j++){
                 Boolean bool=true;
            add=candies[j]+extraCandies;
                if(add<max){
                    bool=false;
                }
                result.add(bool);
            }           
        
        return result;
    
}
}