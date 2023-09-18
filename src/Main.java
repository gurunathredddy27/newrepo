import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.println("Namaste");

        Scanner sc = new Scanner(System.in);
        System.out.println("choose any number");
        int a = sc.nextInt();
        System.out.println("choose another number");
        int b = sc.nextInt();

        System.out.println("Enter your choice 1)Add, 2)Sub, 3)Mul, 4)Div, 5)Remainder");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                int add = a + b;
                System.out.println("The addition of two numbers " + add);
                break;
            case 2:
                int sub = a -b;
                System.out.println("The subtration of two numbers "+ sub);
                break;
            case 3:
                int mul = a * b;
                System.out.println("The multiplication of two numbers "+ mul);
                break;
            case 4:
                int div = a / b;
                System.out.println("The division of two numbers "+ div);
                break;
            case 5:
                int mod = a % b;
                System.out.println("The modulus of two number "+ mod);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}