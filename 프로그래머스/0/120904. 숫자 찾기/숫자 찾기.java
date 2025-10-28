class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        char ch = (char)(k+'0');
        String str = Integer.toString(num);
        answer = str.indexOf(ch);
        if (answer == -1) {
            return -1;
        }
        return answer+1;
    }
}