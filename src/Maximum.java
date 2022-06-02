import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Let's find a maximum of three numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please, enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Please, enter third number");
        int thirdNumber = scanner.nextInt();
        System.out.println("Maximum is " + countMaximum(firstNumber, secondNumber, thirdNumber));
        System.out.println("Option 2. Maximum is " + countAnother(firstNumber, secondNumber, thirdNumber));

    }

    private static int countMaximum (int a, int b, int c){

        if (a >= b && a >= c){
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    private static int countAnother (int a, int b, int c){
        int max;
        if (a >= b){
            max = a;
        } else {max = b;}

        if (c >= max ) {
            max = c;
        }
        return max;
    }
}


