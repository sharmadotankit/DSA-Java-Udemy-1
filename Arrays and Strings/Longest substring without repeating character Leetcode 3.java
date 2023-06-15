class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<Character>();
        int left = 0;
        int maxLength = 0;

        for(int right=0;right<s.length();right++){
            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);
            }else{

                while(s.charAt(left)!= s.charAt(right)){
                    charSet.remove(s.charAt(left));
                    left++;
                }

                charSet.remove(s.charAt(left));
                left++;
                charSet.add(s.charAt(right));
            }
        }

        return maxLength;
    }
}