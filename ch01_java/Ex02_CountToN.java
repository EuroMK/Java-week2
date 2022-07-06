import java.util.Scanner;

public class Ex02_CountToN {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();

        for (int x = 0; x <= num; x++)
        {
            System.out.println(x);
        }
    }
}
