class Solution {
    public int[] solution(int[] arr) {
        // 1. 배열 사이즈 결정
        int a = 0;
        for(int i = 0 ; i<arr.length; i++){
            a += arr[i];
        }
        System.out.println("배열 사이즈 : "+ a);
        // 2. answer 배열 만들기
        int[] answer = new int[a];
        
        // 3. 배열 복사
        int index = 0;
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0; j<arr[i]; j++){
                answer[index++] = arr[i];
            }
        }
        return answer;
    }
}