import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("[x ]+");
        List<String> ans = new ArrayList<>();
        for(int i = 0; i<answer.length; i++){
            if(!answer[i].isEmpty()){
                ans.add(answer[i]);
            }
        }
        String[] fin = new String[ans.size()];
        for(int i = 0; i<fin.length; i++ ){
            fin[i] = ans.get(i);
        }
        Arrays.sort(fin);
        return fin;
    }
}