import java.util.Scanner;

class Ex06_Hypotenuse{

    public static void main(String[] args) {
        
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter the first side:");
    double num1 = keyboard.nextInt();
    System.out.println("Please enter the second side:");
    double num2 = keyboard.nextInt();

    double side1 = num1 * num1;
    double side2 = num2 * num2;
    double side3 = side1 + side2;

    System.out.println(Math.sqrt(side3));
        keyboard.close();
    }
}