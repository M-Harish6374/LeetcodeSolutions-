class Solution {
    public double minimumAverage(int[] nums) {
        int len=nums.length/2;
        double[] arr=new double[len];
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            double res=(double)(nums[i]+nums[j])/2;
            arr[i]=res;
            i++;
            j--;
        }
        Arrays.sort(arr);
        return arr[0];
    }
}