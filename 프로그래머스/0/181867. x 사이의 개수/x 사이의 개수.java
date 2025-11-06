import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        int len = 0;

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c == 'x') {
                list.add(len);
                len = 0;
            } else {
                len++;
            }
        }

        list.add(len);
        
        // 리스트 -> 배열
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}