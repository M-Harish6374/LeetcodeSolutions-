class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a1[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            a1[i]=nums1[i];
        }
        int k=nums1.length;
        for(int j=0;j<nums2.length;j++){
            a1[k]=nums2[j];
            k++;
        }
        Arrays.sort(a1);
        int len=a1.length;
        double d=0;
        if(len%2==0){
           
            int total=len/2;
            int val1=a1[total];
            int val2=a1[total-1];
              d=(double)(val1+val2)/2;
            
        }
        
        else{
            //  len=a1.length-1;
              int total=len/2;
              System.out.print("hi");
             d=a1[total];
            
           
        }
        return d;
    }
}