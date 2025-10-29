import java.util.Arrays;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        // 1. 주사위 눈 배열로 전환 후 정렬
        int[] dice = {a,b,c,d};
        Arrays.sort(dice);
        // 2. 비교!
        // 2.1 다 같은 경우
        if(dice[0] == dice[3]){
            answer = 1111*dice[0];
        } // 2.2 세 개만 같은 경우
        else if((dice[0]==dice[2]) && (dice[2] != dice[3])){
            answer = (10*dice[0]+dice[3])*(10*dice[0]+dice[3]);
        }else if((dice[1]==dice[3] )&& (dice[1] != dice[0])){
            answer = (10*dice[1]+dice[0])*(10*dice[1]+dice[0]);
        } // 2.3 두개씩 같은 경우
        else if(dice[0]==dice[1] && dice[2]==dice[3]){
            answer = (dice[0]+dice[2])*(Math.abs(dice[0]-dice[2]));
        }// 2.4 두 개만 같은 경우
        else if(dice[0]==dice[1] && dice[0] != dice[2] && dice[2]!=dice[3]){
            answer = dice[2]*dice[3];
        }else if(dice[1]==dice[2] && dice[1] != dice[0] && dice[0]!=dice[3]){
            answer = dice[0]*dice[3];
        }else if(dice[2]==dice[3] && dice[2] != dice[1] && dice[1]!=dice[0]){
            answer = dice[0]*dice[1];
        }else{
            answer = dice[0];
        }
        return answer;
    }
}
/*
* 네 주사위가 같은 경우 a=b=c=d
* 세 주사위가 같은 경우 a=b=c/d, a=b=d/c,a=c=d,b b=c=d/a
* 두 개씩 같은 s경우 a=b/c=d, a=c/b=d, a=d/b=c
* 두 개만 같고, 나머지는 다른 경우 a=b, a=c, a=d, b=c, b=d, c=d
* 모두 다른 경우 1개
*/