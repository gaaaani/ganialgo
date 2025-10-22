import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 1;
        Arrays.sort(numbers);
        int a = numbers[0]*numbers[1];
        int b = numbers[numbers.length-1]*numbers[numbers.length-2];
        if(a < b){
            answer=b;
        }else{
            answer=a;
        }
        return answer;
    }
}