class Solution {
    public double myPow(double x, int n) {
      if(n==0){
            return 1;
        }
      double y= myPow(x,n/2); 
        if(n<0){
           x=1/x;
            n=-n;
        }
    
        double ans=y*y; // for even n
        if(n%2==1){
            ans=x*ans; // for odd n
        }
       return ans;
    }
}