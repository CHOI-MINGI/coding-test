import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //각 기능마다 몇일이 걸리는지 계산
        int[] day = new int[progresses.length];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        
        for(int i=0; i<progresses.length; i++) {
            int n = 0;
            //뭔 소수점까지 고려를 처야해하냐..진짜
            n = (int)Math.ceil((100.0-progresses[i])/speeds[i]);
            q.add(n);
        }
        
        //앞 기능 보다 완료일보다 뒷기능이 빠르면 같이배포
        //날짜 앞부터 비교 해서 앞에 날짜가 크면 계속 비교
        //작을경우 배열 1 추가
        int j=q.poll();
        int m = q.size();
        int sum = 1;
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=1; i<=m; i++) {
            int current = q.poll();
            if(j>= current)
                sum++;
            else {
                answer.add(sum);
                sum = 1;
                j = current;
            }
        }
        answer.add(sum);
        
        int[] result = new int[answer.size()];
        for(int i=0; i<answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}