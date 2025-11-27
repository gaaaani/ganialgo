class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        // System.out.println(quiz[0]);
        // System.out.println(quiz.length);
        
        for(int i = 0; i<quiz.length; i++){
            String[] arr = quiz[i].split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);
            int c = Integer.parseInt(arr[4]);
            int res = 0;
            if(arr[1].equals("+")){
                res = a+b;
            }else{
                res = a-b;
            }
            if(c == res){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }
        return answer;
    }
}