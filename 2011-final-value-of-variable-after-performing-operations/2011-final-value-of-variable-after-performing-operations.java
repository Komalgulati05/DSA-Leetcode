class Solution {
    public int finalValueAfterOperations(String[] operations) {
       int x=0;
       char obj='+';
       for(int i=0;i<operations.length;i++){
           String m=operations[i];
      if(m.charAt(0)=='+'||m.charAt(m.length()-1)=='+'){
          x=x+1;
      }
      else{
          x=x-1;
      }
       } 
       return x;
    }
}