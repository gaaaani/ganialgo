class Solution {
    public int solution(int n) {
        // step1
        String reversedInt = Integer.toString(n,3);
        // step2
        StringBuilder sb = new StringBuilder(reversedInt);
        String base = sb.reverse().toString();
        // step3
        return Integer.parseInt(base, 3);
    }
}
// 자연수 n을 3진법 상에서 앞뒤로 뒤집고 다시 10진법으로 표현하기
// step1. 10진법의 n을 3진법으로 나타내기
// step2. 3진법으로 나타낸 수를 뒤집기
// step3. 뒤집은 수를 다시 10진법으로 표현