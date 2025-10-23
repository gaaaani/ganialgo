class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            if (ch == 'A') {
                sb.append('B');
            } else {
                sb.append('A');
            }
        }
        String converted = sb.toString();
        return converted.contains(pat) ? 1 : 0;
    }
}
