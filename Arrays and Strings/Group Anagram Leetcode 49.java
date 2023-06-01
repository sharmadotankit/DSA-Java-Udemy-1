// Time 97 space 14%
class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> ansMap = new HashMap<>();
        for(String str:strs){
            char[] chArr = str.toCharArray();
           Arrays.sort(chArr);
            String newString = new String(chArr);

            if(ansMap.containsKey(newString)){
                ansMap.get(newString).add(str);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                ansMap.put(newString,list);
            }
        }

        return new ArrayList<>(ansMap.values());
    }
}


// Slow solution time beats 7% and space beats 5.8%
class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>,ArrayList<String>> bmap = new HashMap<>();
        for(String str:strs){
            HashMap<Character,Integer> fmap = new HashMap<>();
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                fmap.put(ch,fmap.getOrDefault(ch,0)+1);
            }

            if(bmap.containsKey(fmap)==false){
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                bmap.put(fmap,list);
            }else{
                ArrayList<String> list = bmap.get(fmap);
                list.add(str);
            }
        }

        ArrayList<List<String>> res = new ArrayList<>();
        for(ArrayList<String> val : bmap.values()){
            res.add(val);
        }

        return res;
    }
}