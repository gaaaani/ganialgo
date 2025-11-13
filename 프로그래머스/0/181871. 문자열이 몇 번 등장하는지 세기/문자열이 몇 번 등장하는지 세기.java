class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int pat_size = pat.length();
        for(int i = 0; i<=myString.length()-pat_size; i++){
            if((myString.substring(i,i+pat_size)).equals(pat)){
                answer++;
            }
        }
        return answer;
    }
}