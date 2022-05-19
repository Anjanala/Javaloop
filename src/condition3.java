import java.util.Scanner;
public class condition3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter value of num");


        if (num > 0) {
            System.out.println("number is positive");
        } else if (num < 0) {
            System.out.println("number is Negative");

        } else if (num == 0) {
            System.out.println("number is 0");


        }
    }
}
