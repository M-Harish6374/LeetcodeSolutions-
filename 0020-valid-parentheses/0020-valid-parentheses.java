class Solution {
    public boolean isValid(String s) {
        char[] ch=s.toCharArray();
        int count0=0,count1=0,count2=0,count3=0,count4=0,count5=0;
        for(int i=0;i<ch.length;i++){
        if(ch[i]=='('){
            count0++;
        }
        else if(ch[i]=='{'){
            count1++;
        }
        else if(ch[i]=='['){
            count2++;
        }
        else if(ch[i]==')'){
            count3++;
        }
        else if(ch[i]=='}'){
            count4++;
        }
        else if(ch[i]==']'){
            count5++;
        }
        }
        if(count0==count3){
            return true;
        }
        // if(count1==count4){
        //     return true;
        // }
        // if(count2==count5){
        //     return true;
        // }
        

    
    return false;
    }
}