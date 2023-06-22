class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        if(s1.length()>s2.length()){
            return false;
        }

        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(arr1,arr2)) return true;

        int front = 0;
        int end = s1.length();

        while(end<s2.length()){
            arr2[s2.charAt(front)-'a']--;
            arr2[s2.charAt(end)-'a']++;

            if(Arrays.equals(arr1,arr2)) return true;
            
            front ++;
            end++;
        }

        return false;
    }
}