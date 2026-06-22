class Solution {
    public int lengthOfLongestSubstring(String s) {
     int max=0;
     for(int i=0;i<s.length();i++){
        String res="";
        for(int j=i;j<s.length();j++){
            char ch=s.charAt(j);
            if(res.indexOf(ch)!=-1){
                break;
            }
            res+=ch;
            max=Math.max(max,res.length());
        }
     }
        return max;
     }
}