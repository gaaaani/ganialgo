class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        
        // 0. 지뢰 복사
        int[][] danger = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) danger[i][j] = 1;
            }
        }
        // 1. 지뢰 주변을 표시하기
        // 8방향 이동 (상, 하, 좌, 우, 대각선)
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        // 지뢰 주변 표시
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    for (int d = 0; d < 8; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];
                        if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                            danger[nx][ny] = 1;
                        }
                    }
                }
            }
        }
        // 2. 배열 순회 후 안전지대 return
        for(int i = 0; i<danger.length; i++){
            for(int j = 0; j<danger[0].length; j++){
                if(danger[i][j] == 0){
                    answer ++;
                }
            }
        }
        return answer;
    }
}