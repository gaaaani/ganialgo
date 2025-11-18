class Solution {
    public int solution(String binomial) {
        // 공백 제거
        binomial = binomial.replace(" ", "");

        // 숫자 분리
        String[] nums = binomial.split("[+\\-*]");
        
        // 연산자 찾기
        char op = ' ';
        for (char c : binomial.toCharArray()) {
            if (c == '+' || c == '-' || c == '*') {
                op = c;
                break;
            }
        }

        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);

        int answer = 0;

        switch (op) {
            case '+': answer = a + b; break;
            case '-': answer = a - b; break;
            case '*': answer = a * b; break;
        }

        return answer;
    }
}
