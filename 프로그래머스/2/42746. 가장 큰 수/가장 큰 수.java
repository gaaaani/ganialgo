import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        // 일단 문자열로 바꿔서 합치기
        String[] num = new String[numbers.length];
        for(int i = 0; i<num.length; i++){
            num[i] = String.valueOf(numbers[i]);
        }
        
        // comparator사용해서 비교 해
        Arrays.sort(num, (o1, o2) -> (o2 + o1).compareTo(o1+o2));

        if(num[0].equals("0")){
            return "0";
        }
        String answer = "";
        // 문자열 이어붙이기
        for(int i = 0; i<num.length; i++){
            answer+=num[i];
        }
        return answer;
    }
}