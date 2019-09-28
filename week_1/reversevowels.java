class Solution {
    public String reverseVowels(String s) {
       String vowels="aeiouAEIOU";
       int i = 0;
       int j = s.length()-1;
       char[] k = s.toCharArray();
       while (i < j) {
           while (i < j && vowels.indexOf(k[i]) == -1) {
               i++;
           }
           while (i < j && vowels.indexOf(k[j]) == -1) {
               j--;
           }
           char temp = k[i];
           k[i] = k[j];
           k[j] = temp;
           i++;
           j--;
       }
        return new String(k);
    }
}