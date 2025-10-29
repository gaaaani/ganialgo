import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {

        List<Integer> arrlist = new ArrayList<>();
        // 1. 두 배열 비교 후 동일한 원소 있으면 -1로 바꿈
        for(int i = 0 ; i< delete_list.length; i++){
            for(int j = 0 ; j< arr.length; j++){
              if(delete_list[i] == arr[j]){
                  arr[j] = -1;
              }
            }       
        }
        // 확인용 print
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        // 2. list에 add
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != -1){
                arrlist.add(arr[i]);
            }
        }
        // 3. list -> array
        int[] answer = new int[arrlist.size()];
        for(int i = 0; i<arrlist.size(); i++){
            answer[i] = arrlist.get(i);
        }
        return answer;
    }
}