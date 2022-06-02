class Solution {
    public int maxSubArray(int[] nums) 
    {
        
        int lCurr = 0 ; 
        int rCurr = -1 ; 
        int lMax = -1 ; 
        int rMax = -1 ; 
        int currSum = 0 ; 
        int maxTillNow = Integer.MIN_VALUE ; 
        for(int i = 0 ; i < nums.length ; i++)
        {
            currSum+= nums[i] ; 
            if(currSum > maxTillNow)
            {
                lMax = lCurr ; 
                rMax = i ;
                maxTillNow = currSum ; 
            }
            if(currSum < 0)
            {
                lCurr = i + 1 ; 
                currSum = 0 ; 
            }
        }
        return maxTillNow ; 
        
    }
}