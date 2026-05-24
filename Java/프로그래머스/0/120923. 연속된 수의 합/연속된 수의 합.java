class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int start=0;
        start = (total-num*(num-1)/2)/num;
        
        for(int i=0; i<num; i++){
            answer[i] = start+i;
        }
        
        return answer;
    }
}