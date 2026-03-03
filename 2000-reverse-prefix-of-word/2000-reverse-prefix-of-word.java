class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        
        if (index == -1) {
            return word;
        }
        
        StringBuilder sb = new StringBuilder();
        
        // Reverse prefix
        for (int i = index; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        
        // Append remaining string
        for (int i = index + 1; i < word.length(); i++) {
            sb.append(word.charAt(i));
        }
        
        return sb.toString();
    }
}