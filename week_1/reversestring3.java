class Solution {
    public String reverseWords(String s) {
        String[] splitted = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String g : splitted) {
            res.append(reverse(g) + " ");
        }
        return res.toString().trim();
    }
    public String reverse(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}