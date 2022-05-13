import java.util.Scanner;

public class Main
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Hello, I am MARK B. LAGDAAN .");
        System.out.print("Please enter a whole number: ");
        int num = console.nextInt();

        System.out.println();
        if(num % 2 == 0) {
            System.out.println("You entered an EVEN NUMBER!");
        }
        else {
            System.out.println("You entered an ODD NUMBER!");
        }
    }
}