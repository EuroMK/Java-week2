import java.util.Scanner;

class Ex05_AverageCalculator{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double total = 0;
        int count = 0;
        double average = 0;

        System.out.println("Please enter a number: ");
        String userInput = keyboard.nextLine();

        while (userInput.equals("=") == false) {

            double N = Double.parseDouble(userInput);

            count++;
            total += N;

            System.out.println("Please enter another number: ");
            userInput = keyboard.nextLine();

        }//while
        
        average = total / count;
        System.out.println("The average is " + average);
        keyboard.close();

    } //main
}//class