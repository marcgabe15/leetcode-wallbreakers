class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                res.append(Character.toLowerCase(c));
            }
        }
        String k = res.toString();
        System.out.println(k);
        int left = 0;
        int right = k.length() - 1;
        while (left < right) {
            if (k.charAt(left++) != k.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}