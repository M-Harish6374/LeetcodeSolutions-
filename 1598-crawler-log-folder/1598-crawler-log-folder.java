class Solution {
    public int minOperations(String[] logs) {
        int count=0;
        int count1=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("./")){
                count1++;
            }
            else if(logs[i].equals("../")){
                count-=1;
            }
            else{
                if(count<0){
                    count=0;
                    count++;
                }
                count++;
            }
        }
        if(count<=0){
            return 0;
        }
        else{
            return count;
        }
    }
}