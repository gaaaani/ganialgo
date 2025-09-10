import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String num = my_string.replaceAll("[^0-9]", "");
        System.out.println(num);

        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<num.length(); i++){
            numbers.add(num.charAt(i) - '0');
        }
        Collections.sort(numbers);
        
        int[] answer = new int[numbers.size()];
        for(int i = 0; i<numbers.size(); i++){
            answer[i] = numbers.get(i);
        }
        return answer;
    }
}