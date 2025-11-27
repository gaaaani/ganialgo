class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        // 초기값 지정
        int answer = Integer.parseInt(arr[0]);
        
        // 연산자는 두개 이상 있을 수도 있음
        for(int i = 1; i<arr.length; i+=2){
            String dustkswk = arr[i];
            int nextnum = Integer.parseInt(arr[i+1]);
            if(dustkswk.equals("+")){
                answer+=nextnum;
            }else{
                answer-=nextnum;
            }
        }
        return answer;
    }
}