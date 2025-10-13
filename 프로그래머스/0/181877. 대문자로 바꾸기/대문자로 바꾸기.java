class Solution {
    public String solution(String myString) {

        char[] chArr = myString.toCharArray();
        for (int i = 0; i<chArr.length; i++){
            if(97 <= chArr[i] && chArr[i] <= 122){
                // 소문자 -> 대문자
                chArr[i] = (char)(chArr[i] - 32);
            }
        }
        return new String(chArr);
    }
}