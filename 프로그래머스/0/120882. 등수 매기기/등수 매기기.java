import java.util.Arrays;
class Solution {
    public int[] solution(int[][] score) {
        // 평균 배열 만들기 -> 합을 그대로 사용해도 됨
        int[] mean = new int[score.length];
        for(int i = 0; i<score.length; i++){
            mean[i] = (score[i][0]+ score[i][1]);
        }
        // 순위 배열 만들기
        int[] answer = new int[mean.length];
        
        for(int i = 0; i<mean.length; i++){
            answer[i] = 1;
            for(int j = 0; j<mean.length; j++){
                if(mean[i]<mean[j]){
                    answer[i]++;
                }
            }
        }
        // mean 배열을 가지고 순위를 매겨야 하는데 
        for(int i = 0; i<mean.length; i++){
            System.out.println(mean[i]);
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(mean[i]+"점 : "+answer[i]+"등");           
        }
        return answer;
    }
}