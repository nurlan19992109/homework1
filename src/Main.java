import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                System.out.println("Let the game begin!");
                Random random = new Random();
                int x = random.nextInt(100);

                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter your name");
                String username = scanner.nextLine();
                System.out.println("Please enter the number!");


                do {
                    int entrdnmbr = scanner.nextInt();

                    if (entrdnmbr > x) {
                        System.out.println("Your number is too big. Please, try again.");
                    }

                    if (entrdnmbr < x) {
                        System.out.println("Your number is too small. Enter another number.");
                    }
                    if (entrdnmbr == x) {
                        System.out.println("Congrtultions " + username + "!");

                    }

                }
                while (true);

            }

        }
