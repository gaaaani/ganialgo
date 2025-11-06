class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j]==arr[j][i]){
                    answer = 1;
                }else{
                    // 다른걸 하나라도 발견한다면 바로 0 리턴
                    return answer = 0;
                }
            }
        }
        return answer;
    }
}