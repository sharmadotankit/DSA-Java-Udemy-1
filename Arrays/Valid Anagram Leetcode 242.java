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