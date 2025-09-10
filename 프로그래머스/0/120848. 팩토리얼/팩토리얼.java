class Solution {
    public int solution(int n) {
        int answer = 1;
        int a = 1;
        while(true) {
            a *= answer;
            if(a > n){
                return answer-1;
            }
            answer++;
        }
        // return answer;
    }
}