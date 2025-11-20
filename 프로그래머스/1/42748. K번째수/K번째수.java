import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i<commands.length; i++){
            List<Integer> arrList = new ArrayList<>();
            for(int j = commands[i][0]-1; j<commands[i][1]; j++){
                arrList.add(array[j]);
            }
            int[] listArr = new int[commands[i][1] - commands[i][0] +  1];
            for(int j = 0; j<listArr.length; j++){
                listArr[j] = arrList.get(j);
            }
            Arrays.sort(listArr);
            answer[i] = listArr[commands[i][2]-1];
        }
        return answer;
    }
}