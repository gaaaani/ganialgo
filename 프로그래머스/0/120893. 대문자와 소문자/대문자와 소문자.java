class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] charArr = my_string.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (65 <= charArr[i] && charArr[i] <= 90) {
                // 대문자 -> 소문자
                charArr[i] = (char)(charArr[i] + 32);
            } else if (97 <= charArr[i] && charArr[i] <= 122) {
                // 소문자 -> 대문자
                charArr[i] = (char)(charArr[i] - 32);
            }
        }
        // answer = new String(charArr);
        return new String(charArr);
    }
}