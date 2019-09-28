class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String ans = strs[0];
        for(int i = 1; i < strs.length; i++)
        {
            String temp = strs[i];
            int j = 0;
            //while j is less than the minimum between the length of either strings
            //and the char at j == temp at j increment j
            while(j < Math.min(ans.length(),temp.length()) && ans.charAt(j)==temp.charAt(j))
                j++;
            ans = ans.substring(0,j);
        }
        return ans;
    }
}