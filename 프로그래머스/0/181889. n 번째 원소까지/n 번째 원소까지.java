import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i<n; i++){
            res.add(num_list[i]);
        }
        
        int[] answer = new int[res.size()];
        for(int i = 0; i< res.size(); i++){
            answer[i] = res.get(i);
        }
        return answer;
    }
}