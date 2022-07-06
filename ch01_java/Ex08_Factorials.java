import java.util.Scanner;

public class Ex08_Factorials {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();

        int fact = 1;
        for (int i = 1; i <= num; i++ ){
            fact = fact * i;
        }//for
        System.out.println("The factorial of " + num + " is " + fact);
        keyboard.close();
    }//method main
}//class FactorialTest
