class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if(n==m) {
            if(eq.equals("=")) return 1;
            else return 0;        
        }
        else if(n>m){
            if(ineq.equals(">")) return 1;
            else return 0;
        }
        else{
            if(ineq.equals("<")) return 1;
            else return 0;
        }
    }
}