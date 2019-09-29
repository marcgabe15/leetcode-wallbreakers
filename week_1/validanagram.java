class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character,Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        int i;
        for(char g : s.toCharArray()) {
            int count = map.getOrDefault(g, 0);
            if (count == 0) return false;
            else map.put(g, map.get(g) - 1);
        }
        return true;
    }
}