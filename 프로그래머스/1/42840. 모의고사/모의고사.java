import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        // 수포자 점수 배열
        int[] soopoja1 = {1,2,3,4,5};
        int[] soopoja2 = {2,1,2,3,2,4,2,5};
        int[] soopoja3 = {3,3,1,1,2,2,4,4,5,5};
        // 점수 개수 cnt
        int[] answerCount = new int[3];
        // 반복
        for(int i =0; i<answers.length; i++){
            if(answers[i] == soopoja1[i%5]) answerCount[0]++;
            if(answers[i] == soopoja2[i%8]) answerCount[1]++;
            if(answers[i] == soopoja3[i%10]) answerCount[2]++;
        }
        
        // 가장 높은 점수 찾기
        int max = Math.max(answerCount[0], Math.max(answerCount[1], answerCount[2]));
        // 확인~!
        System.out.println(max);
        
        List<Integer> list = new ArrayList<>();
        
        // 점수가 아니라 사람이 들어가야 함
        if(max == answerCount[0])
            list.add(1);
        if(max == answerCount[1])
            list.add(2);
        if(max == answerCount[2])
            list.add(3);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

/*
수포자 1 - 1,2,3,4,5
수포자 2 - 2,1,2,3,2,4,2,5
수포자 3 - 3,3,1,1,2,2,4,4,5,5

시험은 최대 10000개
수포자 정답 개수를 담은 배열 생성
*/