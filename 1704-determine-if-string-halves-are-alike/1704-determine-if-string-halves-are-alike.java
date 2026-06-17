class Solution {
    public boolean halvesAreAlike(String s) {
        int v1=0;
        int v2=0;
        for(int i=0;i<s.length()/2;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                v1++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
            char ch=s.charAt(i);
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                v2++;
            }
        }
        return v1==v2;
    }
}