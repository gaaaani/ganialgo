class Solution {
    public int[] solution(int[] array) {
       int max = array[0]; // 초기값을 첫 원소로 설정
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        return new int[]{max, index};
    }
}