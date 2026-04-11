import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String num =  input.nextLine();
        int str = num.length();

        while (true){
            if(str%3 != 0) {
                num = "0" + num;
                str++;
            }
            else break;
        }

        StringBuilder b = new StringBuilder();

        for(int i=0;i<str;i+=3){

            int value = 0;
            value += (num.charAt(i)-'0')*4;
            value += (num.charAt(i+1)-'0')*2;
            value += (num.charAt(i+2)-'0');

            b.append(value);
        }
        System.out.println(b);
    }
}