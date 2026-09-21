class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> counts = new HashMap<>(); 
        for(char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        for(char d : t.toCharArray()) {
            counts.put(d, counts.getOrDefault(d, 0) - 1); 
        }
        for(char e : counts.keySet()) {
            if(counts.get(e) != 0) 
                return false; 
        }
        return true; 
    }
}
