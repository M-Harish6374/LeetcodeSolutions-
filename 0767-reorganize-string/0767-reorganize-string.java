class Solution {
    public String reorganizeString(String s) {
        int[] hash=new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        int max=0;
        int length=0;
        for(int i=0;i<hash.length;i++){
            if(hash[i]>max){
                max=hash[i];
                length=i;
            }
        }
        if(max>(s.length()+1)/2){
            return "";
        }
        char[] arr= new char[s.length()];
        int idx=0;
      
        while(hash[length]-- > 0){
            arr[idx]=(char)(length+'a');
            idx+=2;
        }
        for(int i=0;i<hash.length;i++){
            while(hash[i]-- >0){
                if(idx>=arr.length){
                    idx=1;

                }
                arr[idx]=(char)(i+'a');
                idx+=2;
            }
        }


        // String str= String.valueOf(arr);
        return String.valueOf(arr);
    }
}