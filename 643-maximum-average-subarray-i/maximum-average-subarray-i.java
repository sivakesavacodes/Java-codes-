class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left =0;
        double sum =0; 
        double avg=0;
        double maxAvg=0;

        //bulid window 
        for(int right =0; right<k ;right++){
            sum +=nums[right];
            avg =sum/k;
        }//so we now have the sum for the first window  and the avg 
        maxAvg= avg;

        for(int right =k ;right <nums.length;right++){
            sum-=nums[left];
            left++;

            sum+=nums[right];
            avg= sum /k;
            maxAvg = Math.max(maxAvg,avg);
        }
return maxAvg;
    }
}