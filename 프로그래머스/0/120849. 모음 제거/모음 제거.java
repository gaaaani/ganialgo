class Solution {
    public String solution(String my_string) {
        String answer = "";
        System.out.println(my_string);
        for(int i = 0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                answer += ch;
            }               
        }
        return answer;
    }
}