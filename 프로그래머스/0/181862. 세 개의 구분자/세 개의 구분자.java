import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("a"," ");
        myStr = myStr.replace("b"," ");
        myStr = myStr.replace("c"," ");
        String[] answer = myStr.split(" ");
        
        List<String> newStr = new ArrayList<>();
        for(int i = 0; i<answer.length; i++){
            if(!answer[i].equals("")){
                newStr.add(answer[i]);
            }
        }
        if(newStr.isEmpty()){
            return new String[]{"EMPTY"};
        }
        
        String[] fin = new String[newStr.size()];
        for(int i =0; i<fin.length; i++){
            fin[i] =  newStr.get(i);
        }
        return fin;
    }
}