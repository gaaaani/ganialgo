// 다항식 더하기
// 각 항을 하나씩 돌면서 동류항이면 계산하기!
class Solution {
    public String solution(String polynomial) {
        int xCnt = 0;
        int constant = 0;
        // + 기준으로 항 분리
        String[] terms = polynomial.split("\\s*\\+\\s*");
        for (String term : terms) {
            if (term.contains("x")) {
                // x 계수 추출
                String coef = term.replace("x", "").trim();
                xCnt += coef.isEmpty() ? 1 : Integer.parseInt(coef);
            } else {
                // 3. 상수항 추출
                constant += Integer.parseInt(term.trim());
            }
        }

        // 4. 결과 조립
        StringBuilder result = new StringBuilder();
        if (xCnt != 0) {
            result.append(xCnt == 1 ? "x" : xCnt + "x");
        }
        if (constant != 0) {
            if (result.length() > 0) result.append(" + ");
            result.append(constant);
        }

        return result.length() == 0 ? "0" : result.toString();

        
    }
}