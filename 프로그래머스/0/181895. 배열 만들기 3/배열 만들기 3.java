import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<intervals.length; i++){
            int a = intervals[i][0];
            int b = intervals[i][1];
            for(int j = a; j<=b; j++){
                ans.add(arr[j]);
            }
        }
        int[] answer = new int[ans.size()];
        for(int i = 0 ; i<answer.length; i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}