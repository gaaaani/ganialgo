import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        List<Integer> arrList = new ArrayList<>();

        for (int x : arr) {
            if (arrList.isEmpty()) {
                arrList.add(x);
            } else {
                int last = arrList.get(arrList.size() - 1);
                if (last == x) {
                    arrList.remove(arrList.size() - 1);
                } else {
                    arrList.add(x);
                }
            }
        }

        if (arrList.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}
