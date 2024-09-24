class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int b=nums[i]-1;
            int c=nums[i]+1;
            if(a==0 || b%3==0 || c%3==0){
                count++;
            }
            a=0;
            b=0;
            c=0;
        }
        return count;
    }
}