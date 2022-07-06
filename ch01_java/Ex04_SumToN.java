import java.util.Scanner;

class Ex04_SumToN{
    public static void main(String[] args) {

        int sum = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int n = keyboard.nextInt();

        for (int x = 1; x <= n; x++)
        {
            sum += x;
            System.out.println(sum);
        }

        
    }
}