class Solution {
    public int[] solution(int[] arr, int n) {
        int l = arr.length;
        int[] answer = arr.clone();  
        if (l % 2 != 0) {  // 배열 길이가 짝수
            for (int i = 0; i < l; i += 2) {
                answer[i] += n;
            }
        } else {  // 배열 길이가 홀수
            for (int i = 1; i < l; i += 2) {
                answer[i] += n;
            }
        }

        return answer;
    }
}