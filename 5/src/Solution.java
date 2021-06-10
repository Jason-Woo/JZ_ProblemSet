class Solution {
    public String replaceSpace(String s) {
        String ans = "";
        String add = "%20";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                ans = ans.concat(add);
            } else {
                ans = ans.concat(String.valueOf(s.charAt(i)));
            }
        }
        return ans;
    }
}