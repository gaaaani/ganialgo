class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        // 1.
        for(int i = 0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = 0;
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        //2. 가로 * 세로
        int w = sizes[0][0];
        int h = sizes[0][1];
        for(int i = 1; i<sizes.length; i++){
            if(w<sizes[i][0]){
                w = sizes[i][0];
            }
        }
        for(int i = 1; i<sizes.length; i++){
            // 최댓값 찾기 -> Math.max
            if(h<sizes[i][1]){
                h = sizes[i][1];
            }
        }
        return w*h;
    }
}

/*
* 1. 가로, 세로 비교 후 더 긴 쪽을 가로로 놓기
* 2. 사이즈 정하기 -> 가로 중 가장 큰 값과 세로 중 가장 큰 값의 곱으로 정하면 됨
* 명함 번호	가로 길이	세로 길이 
* 1	 60	 50
* 2	 70	 30
* 3	 60	 30
* 4	 80	 40
*/