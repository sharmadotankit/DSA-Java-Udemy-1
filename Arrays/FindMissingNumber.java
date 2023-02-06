// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

class Solution {
  public int missingNumber(int[] nums) {
    // int[] countArr = new int[nums.length+1];
    // Arrays.fill(countArr,1);

    // for(int i=0;i<nums.length;i++){
    // countArr[nums[i]] = countArr[nums[i]] -1;
    // }

    // for(int i=0;i<countArr.length;i++){
    // if(countArr[i]==1){
    // return i;
    // }
    // }
    // return 0;

    int arrSum = 0;
    int length = nums.length;
    int totalSum = 0;
    // for (int i = 0; i <= length; i++) {
    //   totalSum += i;
    // }
    // for (int i = 0; i < length; i++) {
    //   arrSum += nums[i];
    // }


    // Sum of array is n*(n-1)/2;   
     totalSum = (length*(length+1))/2;
    for(int i=0;i<length;i++){
        arrSum+=nums[i];
    }

    return totalSum - arrSum;
  }
}


  
    
    

    
     
    

    
     
     
     
    
    

    
    
    
            
        
    
            
        
    

      
  