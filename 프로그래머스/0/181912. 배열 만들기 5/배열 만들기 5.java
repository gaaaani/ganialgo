import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> listarr = new ArrayList<>();
        for(int i = 0; i<intStrs.length; i++){
            String a = intStrs[i].substring(s, s+l);
            System.out.println(a);
            int num = Integer.parseInt(a);
            if(num>k){
                listarr.add(num);
            }
        }
        int[] answer = new int[listarr.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = listarr.get(i);
        }
        
        return answer;
    }
}