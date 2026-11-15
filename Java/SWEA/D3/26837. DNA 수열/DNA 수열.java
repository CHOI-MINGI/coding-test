/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T1 = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case <= T1; test_case++)
		{
            StringTokenizer st = new StringTokenizer(br.readLine());
			int count = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            int answer = 0;
            for(int i=0; i<s.length(); i++){
                int A = 0;
                int T = 0; 
                int C = 0; 
                int G = 0;
            	for(int j=i; j<s.length(); j++) {
                	switch (s.charAt(j)) {
                        case 'A' : A++; break;
                        case 'T' : T++; break;
                        case 'C' : C++; break;
                        case 'G' : G++; break;
                    }
                    if(A == T&& C==G) answer++;
                }
            }
            System.out.println(answer);
        }
	}
}