// Solution with O(N) time but  space O(1)
class Solution {
    public boolean isAnagram(String s, String t) {
        // Base case: if the two strings are empty...
        if(s == null || t == null) return false;
        // In case of different length of those two string...
        if(s.length() != t.length()) return false;
        // To count freq we make an array of size 26...
        int[] counter = new int[26];
        // Traverse all elements through a loop...
        for(int idx = 0; idx < s.length(); idx++){
            counter[s.charAt(idx)-'a']++;
            counter[t.charAt(idx)-'a']--;
        }
        // Above iteration provides us with count array having all values to zero then we can say we found an anagram.
        // Every element of count has to be equal to 0.
        // If it is greater than 0 it means s has a character whose occurrence is greater than its occurrence in t.
        // And if its less than 0 then, s has a character whose occurrence is smaller than its occurrence in t.
        for(int idx: counter){
            if(idx != 0)
                return false;
        }
        return true;
    }
}










// Solution with O(n) time and space
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        Set<Character> characterSet = new HashSet();
      
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),map1.get(s.charAt(i)).intValue()+1);
            }
            else{
                map1.put(s.charAt(i),1);
            }
            characterSet.add(s.charAt(i));
        }

        for(int i=0;i<t.length();i++){
            if(map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i),map2.get(t.charAt(i)).intValue()+1);
            }
            else{
                map2.put(t.charAt(i),1);
            }
            characterSet.add(t.charAt(i));
        }

        for(Character c: characterSet){
            if(map1.get(c)==null || map2.get(c)==null){
                return false;
            }

            if(map1.get(c).intValue() != map2.get(c).intValue()){
                return false;
            }
        }
        return true;
    }
}