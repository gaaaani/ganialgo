import java.util.*;
class Solution {
    public int solution(String before, String after) {
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a, b)){
            return 1;
        }
        return 0;
    }
}