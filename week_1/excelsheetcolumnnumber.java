class Solution {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) return 0;
        int result = 0;
        int power = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            result += ((s.charAt(i) - 'A' + 1)) * (int)Math.pow(26,power);
            power++;
        }
        return result;
    }
}