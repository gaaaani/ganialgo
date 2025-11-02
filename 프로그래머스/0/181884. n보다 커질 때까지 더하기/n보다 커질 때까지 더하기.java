class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int[] nn = new int[numbers.length];
        for(int i = 0; i<numbers.length; i++){
            answer += numbers[i];
            nn[i] = answer;
        }
        for(int i = 0; i<numbers.length; i++){
            System.out.print(nn[i] + " ");
            if(nn[i]>n){
               return answer = nn[i];
            }
        }
        return answer;
    }
}