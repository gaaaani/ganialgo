import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        // 2가 포함된 배열의 인덱수 반환하기
        int a = -1;
        int b = -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==2){
                a = i;
            break;
            }

        }
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==2){
                b = i;
            break;
            }
        }
        // 2가 없으면 [-1] 반환
        if (a == -1) {
            return new int[]{-1};
        }
        
        // 2가 하나만 있으면 [2] 반환
        if (a == b) {
            return Arrays.copyOfRange(arr, a, a + 1);
        }
        
        // 첫 번째 2부터 마지막 2까지 잘라서 반환
        return Arrays.copyOfRange(arr, a, b + 1);
    
    }
}