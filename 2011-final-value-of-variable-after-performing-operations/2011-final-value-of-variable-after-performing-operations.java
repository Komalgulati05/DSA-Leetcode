class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                X=X+1;
                System.out.println(X);
            }
            else{
                X=X-1;
                System.out.println(X);
            }
        }
        return X;
    }
}