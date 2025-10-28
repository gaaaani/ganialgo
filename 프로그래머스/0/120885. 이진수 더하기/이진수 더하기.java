class Solution {
    public String solution(String bin1, String bin2) {
        int a = Integer.parseInt(bin1, 2);
        int b = Integer.parseInt(bin2, 2);

        // 두 정수 더하기
        int sum = a + b;

        // 다시 이진수 문자열로 변환
        return Integer.toBinaryString(sum);
    }
}