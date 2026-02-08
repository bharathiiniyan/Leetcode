class Solution {
    public boolean isIsomorphic(String S, String T) {
        HashMap<Character,Character>mapST=new HashMap<>();
        HashMap<Character,Character>mapTS=new HashMap<>();
        for(int i=0;i<S.length();i++){
            char a=S.charAt(i);
            char b=T.charAt(i);
            if(mapST.containsKey(a)){
                if(mapST.get(a)!=b){
                    return false;
                }
            }
            else{
                mapST.put(a,b);
            }
            if(mapTS.containsKey(b)){
                if(mapTS.get(b)!=a){
                    return false;
                }
            }
            else{
                mapTS.put(b,a);
            }
        }
        return true;
    }
}