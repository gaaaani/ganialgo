class Solution {
    public int[][] solution(int[][] arr) {
        // 1. arr 배열의 사이즈 알아보기
        int col = arr.length;
        int row = arr[0].length;
        System.out.println("col:" + col + " row:"+row);
        
        // 2. max 값으로 answer 배열 생성하기
        int m = Math.max(col, row);
        int[][] answer = new int[m][m];
        
        // 3. 배열 복사
        for(int i = 0; i<col; i++){
            for(int j = 0; j<row; j++){
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}