import java.util.Scanner;

class Ex03_MultiplesOfThree{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();

        for (int x = 0; x <= num; x+=3)
        {
            if (x % 3 == 0)
            {
            System.out.println(x);
            }
        }
    }
}