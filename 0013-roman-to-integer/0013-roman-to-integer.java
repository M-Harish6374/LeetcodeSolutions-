class Solution {
    public int romanToInt(String s) {
        char[] arr=s.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
      //  int a=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            int a=hm.get(arr[i]);
            if(i+1==arr.length){
                count+=a;
                break;
            }
            else{

          
            int b=hm.get(arr[i+1]);
            if(a>=b){
                    count +=a;
                    
            }
           
            else {
                count +=b-a;
                i++;
            }
        }
        }
        return count;
       
}
}
