import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] strLength = new int[strArr.length];
        // string.length()
        for(int i = 0; i<strArr.length; i++){
            strLength[i] = strArr[i].length();
        }
        // 개수 구하기 
        // -> 1 2 1 3 2 -> 1 1 2 2 3
        Arrays.sort(strLength);
        for(int i = 0; i<strArr.length; i++){
            System.out.print(strLength[i]+" ");
        }
        int max = 1;
        int k = 1;

        for (int i = 1; i < strLength.length; i++) {
            if (strLength[i] == strLength[i - 1]) {
                k++;
            } else {
                max = Math.max(max, k);
                k = 1;
            }
        }

        max = Math.max(max, k);

        return max;
    }
}
