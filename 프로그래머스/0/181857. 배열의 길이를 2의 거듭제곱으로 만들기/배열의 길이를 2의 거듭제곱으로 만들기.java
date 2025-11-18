class Solution {
    public int[] solution(int[] arr) {
        int size = arr.length;
        int next = 1;

        // size 이상이 될 때까지 2배씩 증가
        while (next < size) {
            next *= 2;
        }

        int[] answer = new int[next];

        // 기존 arr 복사
        for (int i = 0; i < size; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}
