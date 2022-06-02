import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        System.out.println("May I watch your new film?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your age:");
        int userAge = scanner.nextInt();
        System.out.println("Please, enter age limit of the film: ");
        int ageLimit = scanner.nextInt();
        mayUserWatch(userAge,ageLimit);


    }


    private static void mayUserWatch(int userAge, int ageLimit) {

        if (userAge >= ageLimit) {
            System.out.println("Yes, you can watch the film! :)");
        } else {
            System.out.println("Sorry, no, you can't watch this film! :(");
        }

    }
}
