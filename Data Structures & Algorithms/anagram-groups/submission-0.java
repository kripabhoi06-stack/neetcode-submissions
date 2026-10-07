class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> list=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chars=strs[i].toCharArray();

            Arrays.sort(chars);
            String key=new String(chars);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);

        }
        return new ArrayList<>(map.values());
    }
}
