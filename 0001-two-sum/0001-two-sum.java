class Solution {
    public int[] twoSum(int[] nums, int target) {
        int b[]=new int[2];
        int count=0;
         int j=1;
        for(int i=0;i<nums.length;i++){
            for( j=i+1;j<nums.length;j++){
                if( nums[i]+nums[j]==target){
                   count=1;   
                    break;
                }
            }
            if(count==1){
                b[0]=i;
                b[1]=j;
                break;
            }
            
        }
        return b;
    }
}