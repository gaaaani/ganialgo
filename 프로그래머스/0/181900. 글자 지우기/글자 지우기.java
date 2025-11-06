import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[] indices) {
        // 꼬임 방지용 정렬
        Arrays.sort(indices);
        
        String answer = my_string;
        for (int i = indices.length - 1; i >= 0; i--) {
            // 제거할 문자
            char c = my_string.charAt(indices[i]);
            // replaceFirst를 써서 해당 문자 중 처음 등장하는 하나만 제거
            answer = answer.substring(0, indices[i]) + answer.substring(indices[i] + 1);
        }
        return answer;
    }
}