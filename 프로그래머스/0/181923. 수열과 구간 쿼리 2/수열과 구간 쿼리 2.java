import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);

        for(int i = 0; i<queries.length; i++){
            int[] query = queries[i];
            int s = query[0], e = query[1], k = query[2];

            // 주어진 범위 내에서 k보다 크면서 가장 작은 값을 찾습니다.
            for (int j = s; j <= e; j++) {
                if (k < arr[j]) {
                    // 현재까지의 최솟값을 업데이트합니다.
                    answer[i] = answer[i] == -1 ? arr[j] : Math.min(answer[i], arr[j]);
                }
            }
        }

        // 결과 배열을 반환합니다.
        return answer;
    }
}