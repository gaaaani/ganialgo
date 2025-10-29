import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        // 1. 배열 정렬
        Arrays.sort(num_list);
        // 2. num_list[5:~] 배열 복사
        int size = num_list.length;
        int[] answer = new int[size-5];
        for(int i = 5; i<size; i++){
            answer[i-5] = num_list[i];
        }
        return answer;
    }
}