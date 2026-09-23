class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>(); 
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = Arrays.toString(chars);
            groups.putIfAbsent(key, new LinkedList<>()); 
            groups.get(key).add(str); 
        }
        List<List<String>> groupedList = new LinkedList<>(); 
        for(String s : groups.keySet()) {
            groupedList.add(groups.get(s)); 
        }
        return groupedList; 
    }
}
