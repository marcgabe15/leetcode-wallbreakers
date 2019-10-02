class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> jewel = new HashSet<>();
        int counter = 0;
        for (char c : J.toCharArray()) {
            jewel.add(c);
        }
        for (char d : S.toCharArray()) {
            if(jewel.contains(d)) {
                counter++;
            }
        }
        return counter;
    }
}