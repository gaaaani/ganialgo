import java.util.*;
class Solution {
    public String[] solution(String myStr) {
    String[] arr = myStr.split("[abc]+"); // a, b, c 로 나누기
    List<String> list = new ArrayList<>();
    
    for (String s : arr) {
        if (!s.isEmpty()) list.add(s); // 빈 문자열 제거
    }
    
    return list.isEmpty() ? new String[]{"EMPTY"} : list.toArray(new String[0]);
    }

}