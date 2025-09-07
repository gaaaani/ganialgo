class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i = 0; i< parts.length; i++){
            for(int j = 0; j<parts[0].length; j++){
                System.out.println("parts[" + i + "][" + j + "] : " + parts[i][j]);
            }
        }
        
        for(int x = 0; x<my_strings.length; x++){
            String str = my_strings[x];
            answer += str.substring(parts[x][0], parts[x][1]+1);
        }
        return answer;
    }
}
// substring