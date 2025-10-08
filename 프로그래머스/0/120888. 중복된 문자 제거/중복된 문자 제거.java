import java.util.*;
class Solution {
    public String solution(String my_string) {        
        Set<String> tmp = new LinkedHashSet<>();
        String[] myarr = my_string.split("");
        for(String arr : myarr) {
            tmp.add(arr);
        }
        return String.join("", tmp);
    }
}