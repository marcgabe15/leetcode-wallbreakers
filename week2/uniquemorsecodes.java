class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> result = new HashSet<String>();
        String[] alphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String word : words) {
            StringBuilder temp = new StringBuilder();
            for (char c : word.toCharArray()) {
                temp.append(alphabet[c-'a']);
            }
            if (!result.contains(temp.toString())) {
                result.add(temp.toString());
            }
        }
        return result.size();
    }
}