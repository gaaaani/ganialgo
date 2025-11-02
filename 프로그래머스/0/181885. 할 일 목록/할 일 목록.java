import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> not_fin = new ArrayList<>();
        for(int i = 0; i<todo_list.length; i++){
            if(finished[i] == false){
                not_fin.add(todo_list[i]);
            }
        }
        String[] answer = new String[not_fin.size()];
        for(int i = 0 ;i<not_fin.size(); i++){
            answer[i] = not_fin.get(i);
        }
        return answer;
    }
}