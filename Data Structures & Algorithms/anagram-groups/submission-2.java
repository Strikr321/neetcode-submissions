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
        return new LinkedList<>(groups.values()); 
    }
}
