class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ansMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int numberToFind = target-nums[i];
            if(ansMap.get(numberToFind)!=null){
                return new int[]{i,ansMap.get(numberToFind).intValue()};
            }else{
                ansMap.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}