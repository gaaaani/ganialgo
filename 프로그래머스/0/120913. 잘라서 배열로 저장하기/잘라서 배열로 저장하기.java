import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        // return 배열의 크기는 
        int size = 0;
        if(my_str.length() % n ==0){
            size = my_str.length() / n;
        }else{
            size = my_str.length() / n + 1;
        }
        System.out.print(size);
        
        String[] answer = new String[size];
        for (int i = 0; i < size; i++) {
            int start = i * n;
            int end = Math.min(start + n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}