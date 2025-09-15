class Solution {
    public int solution(String number) {
        int answer = 0;
        // char[] arr = new char[number.length()];
        for(int i = 0; i<number.length(); i++){
            answer += number.charAt(i) - '0';
        }
        return answer % 9;
    }
}