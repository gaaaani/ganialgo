import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> res = new ArrayList<>();

        for(int i = n-1; i <num_list.length; i++){
            res.add(num_list[i]);
        }
        
        int[] ans = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}