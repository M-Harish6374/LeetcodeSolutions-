class Solution {
    public int searchInsert(int[] nums, int target) {
       int i=0;    //start index for binary search
        int j = nums.length-1;  // end index for binary search
        while(i<=j){
            int mid = i + (j-i)/2 ;
            if(nums[mid]==target){
                return mid;     //return if index found
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return i;    
    }
}