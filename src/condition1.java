import java.util.Scanner;
public class condition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if (num % 20 == 0) {
            System.out.println("the num is even");
        } else {
            System.out.println("the number is odd");
        }
    }
}
