class Solution {
    public int[] decode(int[] encoded) {
        int len=encoded.length+1;
        int first=0;
        for(int i=1;i<=len;i++){
            first ^=i;
        }
        for(int i=1;i<encoded.length;i +=2){
            first ^=encoded[i];
        }
        int[] perm=new int[len];
        perm[0]=first;
        for(int i=0;i<encoded.length;i++){
            perm[i+1]=perm[i]^encoded[i];
        }
        return perm;    
    }
}