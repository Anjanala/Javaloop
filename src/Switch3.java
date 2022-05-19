import java.util.Scanner;
public class Switch3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a char: [We will take first char if you enter multiple]");
        String value = sc.nextLine();
        char ch = value.toLowerCase().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default:
            System.out.println("consonant");
        }
    }
}
