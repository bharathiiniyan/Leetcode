class Solution {
    public boolean isPalindrome(int x) {
        //int a=0;
        while(x<0){
            return false;
        }
        int orig=x;
        int rev=0;
      while(x>0){
        int a=x%10;
        rev=rev*10+a;
        x=x/10;
      }
        return rev==orig;
    }
}