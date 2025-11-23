class Solution {
    public long solution(long n) {
        long x = (long)Math.sqrt(n); // 실제 정수 제곱근에 근접한 값
        System.out.print(x);
        // 검증
        if (x * x == n) return (x + 1) * (x + 1);

        return -1;
    }
}

// 두가지 방법이 떠올랐어요.
// 반복하면서 찾기
// 제곱수 찾기