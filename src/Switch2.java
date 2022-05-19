import java.util.Scanner;
public class Switch2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a num1");
        int num1=sc.nextInt();
        System.out.println("Enter a num2");
        int num2=sc.nextInt();
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a symbol");
        String symbol=Sc.next();



        switch (symbol){
            case "+":
                System.out.println("The addition is "+(num1+num2));
                break;

            case "-":
                System.out.println("the subtraction is"+(num1-num2));
                break;

            case "*":
                System.out.println("The multipication is"+(num1*num2));
                break;
            case "/":
                System.out.println("The division is"+(num1/num2));
                break;

        }
    }
}
