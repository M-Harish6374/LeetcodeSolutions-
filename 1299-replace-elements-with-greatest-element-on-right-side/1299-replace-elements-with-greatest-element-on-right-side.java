class Solution {
    public int[] replaceElements(int[] arr) {
        int[] arr1=new int[arr.length];
        int val=0;
        for(int i=0;i<arr.length;i++){
            val=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>val){
                    val=arr[j];
                }
            }
            arr1[i]=val;
        }
        arr1[arr1.length-1]=-1;
       
        return arr1;
    }
}