class Solution {
    public long countVowels(String word) {
        long c=0;
        long length=word.length();
        for(int i=0;i<word.length();i++){
             char ch=word.charAt(i);
             if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                c+=(i+1)*(length-i);
             }
        }
        return c;
    }
}