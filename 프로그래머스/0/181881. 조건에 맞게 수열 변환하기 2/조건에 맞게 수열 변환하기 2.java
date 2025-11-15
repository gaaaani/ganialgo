class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        while (true) {
            int[] next = new int[arr.length];

            // arr(x+1) 만들기
            for (int i = 0; i < arr.length; i++) {
                int v = arr[i];
                if (v >= 50 && v % 2 == 0) {
                    next[i] = v / 2;
                } else if (v < 50 && v % 2 == 1) {
                    next[i] = v * 2 + 1;
                } else {
                    next[i] = v;  // 조건에 안 맞으면 값 변화 없음
                }
            }

            // arr(x) == arr(x+1) 체크
            boolean same = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != next[i]) {
                    same = false;
                    break;
                }
            }

            if (same) return answer;

            // 다음 반복
            arr = next;
            answer++;
        }
    }
}