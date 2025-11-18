class Solution {
    public int[] solution(int[] arr, int[] query) {
        // 시작점과 끝점을 갱신 
        int start = 0;
        int end = arr.length - 1;
        
        for(int i = 0; i<query.length; i++){
            if(i % 2 ==0){
                end = start + query[i];
            }else{
                start = start + query[i];
            }
        }
        int[] answer = new int[end - start + 1];
        // 배열 복사
        for (int i = start; i <= end; i++) {
            answer[i - start] = arr[i];
        }
        return answer;
    }
}
// 짝수일때 i번 앞에꺼 살림
// 홀수일때 i번 뒤에꺼 살림