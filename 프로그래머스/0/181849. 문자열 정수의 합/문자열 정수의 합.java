class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(int i = 0; i<num_str.length(); i++){
            answer += num_str.charAt(i)-'0'; // '0'을 뺌으로써 아스키코드 값 자체로도 가능
        }
        return answer;
    }
}