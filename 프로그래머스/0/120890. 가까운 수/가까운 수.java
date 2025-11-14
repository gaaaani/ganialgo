class Solution {
    public int solution(int[] array, int n) {
        int m = Math.abs(array[0] - n);
        int answer = array[0];
        // 가까운 수가 여러개일 경우면 더 더 작은 수 return
        for(int i = 1; i<array.length; i++){
            int diff = Math.abs(array[i] - n);
            if (diff < m) {
                // 더 가까운 수 발견
                m = diff;
                answer = array[i];
            } else if (diff == m) {
                // 차이가 같다면 더 작은 수 선택
                if (array[i] < answer) {
                    answer = array[i];
                }
            }

        }
        
        return answer;
    }
}

