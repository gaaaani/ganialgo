import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        System.out.println(my_string);
        
        char[] ch = my_string.toCharArray();
        Arrays.sort(ch);
        String answer = new String(ch);

        return answer;
    }
}