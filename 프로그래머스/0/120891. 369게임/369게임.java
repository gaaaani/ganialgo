class Solution {
    public int solution(int order) {
        int answer = 0;
        // char tsn = (char)(order+'0');
        String numStr = Integer.toString(order);
         for(int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            if(ch == '3' || ch == '6' || ch == '9') {
                answer++;
            }
        }
        
        
        return answer;
    }
}

// int num=1;
// char numChar = Integer.toString(num).charAt(0);