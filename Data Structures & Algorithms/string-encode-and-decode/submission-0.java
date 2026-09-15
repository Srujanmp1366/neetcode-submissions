class Solution {
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            int j = i;
            // Find the delimiter '#'
            while (str.charAt(j) != '#') {
                j++;
            }
            // Parse length (works for any number of digits)
            int length = Integer.parseInt(str.substring(i, j));
            
            // Extract the word directly after '#'
            int start = j + 1;
            ans.add(str.substring(start, start + length));
            
            // Move pointer to the start of the next segment
            i = start + length;
        }
        
        return ans;
    }
}