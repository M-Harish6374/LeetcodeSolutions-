class Solution {
    public int search(int[] nums, int target) {
        int res=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                res=i;
                count=1;
                break;
            }
           
        }
        if(count==0){
            res=-1;
        }
        return res;
    }
}