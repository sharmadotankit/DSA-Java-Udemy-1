class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet();
        int ans = 0;
        for(int a:nums)
            numsSet.add(a);
        for(int i=0;i<nums.length;i++){
            int lengthNum = 0;
            if(!numsSet.contains(nums[i]-1)){
                while(numsSet.contains(nums[i]+lengthNum)){
                    lengthNum++;
                }
                ans = Math.max(lengthNum,ans);
            }  
        }
        return ans;
    }
}