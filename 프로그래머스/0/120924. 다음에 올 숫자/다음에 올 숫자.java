class Solution {
    public int solution(int[] common) {
        int size = common.length;
        if(common[0]+common[2] == 2*common[1]){
            return common[size-1]+(common[1] - common[0]);
        }else if(common[0]*common[2] == common[1]*common[1]){
            return common[size-1]*(common[1]/common[0]);
        }
        return 0;
    }
}

// 등비중항과 등차 중항을 이용하면 됨