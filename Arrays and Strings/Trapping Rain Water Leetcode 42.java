// Optimal Solution
class Solution {
    public int trap(int[] height) {
        if(height.length<=1){
            return 0;
        }
        
        int total = 0;

        int leftPointer = 0;
        int rightPointer = height.length-1;
        int maxLeft = 0;
        int maxRight = 0;

        while(leftPointer<rightPointer){
            if(height[leftPointer]<=height[rightPointer]){
                if(height[leftPointer]>=maxLeft){
                    maxLeft = height[leftPointer];
                    leftPointer++;
                }else{
                    total+= maxLeft - height[leftPointer];
                    leftPointer++;
                } 
            }else{
                if(height[rightPointer]>=maxRight){
                    maxRight = height[rightPointer];
                    rightPointer--;
                }else{
                    total+= maxRight - height[rightPointer];
                    rightPointer--;
                } 
            }
        }
        return total;
    }
} 






// Solution with not optimal code  Time : O(n2)  Space : O(1)
class Solution1 {
    public int trap(int[] height) {
        if(height.length<=1){
            return 0;
        }
        int ans = 0;
        for(int p=0;p<height.length;p++){
            int leftP = p;
            int rightP = p;
            int maxLeft = 0;
            int maxRight = 0;

            while(leftP>=0){
                maxLeft = Math.max(maxLeft, height[leftP]);
                leftP--;
            }

            while(rightP<height.length){
                maxRight = Math.max(maxRight,height[rightP]);
                rightP++;
            }

            int currentWater = Math.min(maxLeft,maxRight) - height[p];
            if(currentWater>=0){
                ans+= currentWater;
            }
        }
        return ans;
    }
} 