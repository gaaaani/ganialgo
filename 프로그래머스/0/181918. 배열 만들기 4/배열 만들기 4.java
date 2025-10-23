import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        // int[] stk = {};
        List<Integer> list = new ArrayList<>();
        // int i = 0;
        int l = arr.length;
        for(int i = 0; i<l; i++){
        if(i<l){
            if(list.isEmpty()){
                list.add(arr[i]);
            } else if (list.get(list.size() - 1)< arr[i]){
                list.add(arr[i]);
            } else {
                list.remove(list.size() - 1);
                i--;
            }
        }
    }
        int[] stk = new int[list.size()];
        for(int k = 0; k<list.size(); k++){
            stk[k] = list.get(k);
        }
        return stk;
    }
}

// 정수 배열 arr -> stk
// i = 0, if(i<arr[i]){stk[]}
// stk 빈배열 -> arr[i] 추가 후 i++
// stk 원소 있는데 마지막 원소가 < arr[i] -> arr[i] 추가 후 i++
// stk 원소 있는데 마지막 원소가 >= arr[i] -> stk 마지막 원소 제거