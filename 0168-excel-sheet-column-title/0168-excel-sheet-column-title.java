class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
        String res="";
        while(n>0){
            n--;
            res=(char)('A'+n%26)+res;
            n=n/26;
        }
        return res;
    }
}