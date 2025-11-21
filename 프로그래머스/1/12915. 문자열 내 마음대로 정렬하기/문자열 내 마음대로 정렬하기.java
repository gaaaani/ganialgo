import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        Arrays.sort(strings, Comparator
                    .comparing((String s) -> s.charAt(n))
                   .thenComparing(s ->s));
        // Arrays.sort(strings, (o1, o2) -> Character.compare(o1.charAt(n), o2.charAt(n)));
        
        return strings;
    }
}


// 인덱스의 n번째 글자를 기준으로 정렬 -> 