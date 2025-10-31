import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();
        Arrays.sort(ch); 
        int cnt = 0;
        System.out.print(ch);
        for(int i=0; i<ch.length; i++){
            cnt=0;
            for(int j=0; j<ch.length; j++){
                if(ch[i] == ch[j]){
                    cnt++;
                }
            }
            if(cnt==1){
                answer+=ch[i];
            }            
        }
        return answer;
    }
}