class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int aa=0, bb=0;
        int a = arr1.length;
        int b = arr2.length;
        for(int i = 0; i<a; i++){
            aa += arr1[i];
        }
        for(int j = 0; j<b; j++){
            bb += arr2[j];
        }
        if(a == b){
            if(aa == bb){
                return 0;
            }else if(aa > bb){
                return 1;
            }else{
                return -1;
            }
        }else{
            if(a>b){
                return 1;
            }else if(a<b){
                return -1;
            }
        }
        return answer;
    }
}