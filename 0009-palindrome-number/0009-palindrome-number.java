class Solution {
    public boolean isPalindrome(int x) {
        int a=0;
        int i=x;
        while(i>0){
            a=a*10+i%10;
            
            i =i/10;
        }

        if(x!=a){
            return false;
        }
        else{
           return true;
        }
      
    }
}