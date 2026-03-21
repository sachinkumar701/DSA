class Solution {
    public int minimizedStringLength(String s) {
        StringBuilder str = new StringBuilder("");
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(!str.toString().contains(String.valueOf(c))){
                str.append(s.charAt(i));
            }
        }
        return str.length();
    }
}

//sb.toString().contains(subString)