import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> strList = new ArrayList<>();
        for(int i = 0; i<my_string.length(); i++){
            strList.add(my_string.substring(i));
        }
        String[] answer = new String[strList.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = strList.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}