class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[1] = n*m;
        // 최대공약수 answer[0], 최소공배수 answer[1]
        // 유클리드 호재법
        while (m != 0) {
            int r = n % m; // 나머지
            n = m;
            m = r;
        }
        answer[0] = n;
        answer[1] /= n; 
        return answer;
    }
}

// 최대공약수 -> 유클리드 호재법
// A를 B로 나눈 나머지가 R일 때, A와 B의 최대공약수는 B와 R의 최대공약수와 같다.