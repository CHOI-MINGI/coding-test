import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String num =  input.nextLine();
        int result = Integer.parseInt(num, 16);
        System.out.println(result);
    }
}
