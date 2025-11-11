class Solution {
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        // 방문에 대한 bool형 배열 선언
        boolean[] visited = new boolean[dungeons.length];
        
        // 완전탐색
        dfs(k, dungeons, visited, 0);
        
        return answer;
    }
    public void dfs(int fatigue, int[][] dungeons, boolean[] visited, int count){
        answer = Math.max(answer, count);
        
        // 반복하기
        for(int i = 0; i < dungeons.length; i++){
            int need = dungeons[i][0];
            int cost = dungeons[i][1];
            
            if(!visited[i] && fatigue >= need){
                visited[i] = true;
                dfs(fatigue - cost, dungeons,visited, count +1);
                visited[i] = false; // 백트래킹
            }
        }
    }
    
}

/*
* 소모 피로도 기준으로 오름차순 정렬하면 되려나? -> 완전탐색은 아님!
* 모든 경우의 수를 다 고려하는 것이 완전탐색!
* 모든 경우를 고려하는 방법?
* - dfs 함수 생성
* - 백트래킹 : 완전탐색하되, 더 이상 가능하지 않으면 더 탐색 X
*/