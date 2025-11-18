import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        for(int j = 0; j<arr.length; j++){
            if(flag[j]){
                for(int i = 0; i<arr[j]*2; i++){
                    list.add(arr[j]);
                }
            }else{
                for(int i = 0; i<arr[j]; i++){
                    list.remove(list.size() - 1);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}