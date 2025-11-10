class Solution {
    public int solution(String my_string) {
        // 문자 기준으로 분리
        String[] num = my_string.split("[^0-9]+");
        int sum = 0;
        for(String number : num){
            if(!number.equals("")){
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }
}