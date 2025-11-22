class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int row = (n + w - 1) / w; // 총 행 개수 (올림 나눗셈)
        int[][] arr = new int[row][w];
        
        int cnt = 1;
        for(int i = 0; i<row; i++){
            if(i % 2 == 0) {// 짝수 왼 -> 오
                for(int j = 0; j<w; j++){
                    if(cnt <= n){
                        arr[i][j] = cnt++;
                    }
                }
            }else{
                for(int j = w-1; j>=0; j--){
                    if(cnt <= n){
                        arr[i][j] = cnt++;
                    }
                }
            }
        }
        
        int targetrow = -1, targetcol = -1;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<w; j++){
                if( arr[i][j] == num){
                    targetrow = i;
                    targetcol = j;
                    break;
                }
            }
            if(targetrow != -1) break;
        }
        
        // 해당 row 위 상자 세기
        for(int i = targetrow; i<row; i++){
            if(arr[i][targetcol] != 0){
                answer++;
            }
        }
        
        return answer;
    }
}