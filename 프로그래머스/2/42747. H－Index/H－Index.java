import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int cnt = citations.length; // 논문 개수
        
        // 배열 정렬(오름차순)
        Arrays.sort(citations);
        for(int i = 0; i<citations.length; i++){
            int h = cnt-i;
            if(citations[i] >= h){
                return h;
            }
        }
        return answer;
    }
}

