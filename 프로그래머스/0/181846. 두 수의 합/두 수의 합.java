import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        return A.add(B).toString();
    }
}

// String answer = (Integer.parseInt(a) + Integer.parseInt(b))+"";
// 길이 때문에 위 불가능, 문자열 더하고 올리기 하는 방법으로 해야 한다고 함
// BigInteger 방법