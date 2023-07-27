class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result=new ArrayList<>();
        int add=0;
        for(int i=0;i<candies.length;i++){
            Boolean bool=true;
            add=candies[i]+extraCandies;
            for(int j=0;j<candies.length;j++){
                if(add<candies[j]){
                    bool=false;
                    break;
                }
            }
            result.add(bool);
        }
        return result;
    }
}