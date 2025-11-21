import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        List<String> ans = new ArrayList<>();
        for(int i = 0; i<answer.length; i++){
            if(!answer[i].isEmpty()){
                ans.add(answer[i]);
            }
        }
        String[] fin = new String[ans.size()];
        for(int i = 0; i<fin.length; i++){
            fin[i] = ans.get(i);
        }
        return fin;
    }
}