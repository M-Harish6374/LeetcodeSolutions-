class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<words1.length;i++){
            count=0;
            count1=0;
            for(int j=0;j<words1.length;j++){
                if(words1[i].equals(words1[j])){
                    count++;
                }
            }
            for(int k=0;k<words2.length;k++){
                if(words1[i].equals(words2[k])){
                    count1++;
                }
            }
            if(count==1 && count1==1){
                count2++;
            }
        }
        return count2;
    }
}