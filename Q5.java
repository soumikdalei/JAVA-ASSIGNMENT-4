import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < a ; i++){
            if (a % i == 0) {
                sum=sum+i;
            }
        }

            if (sum == a) {
                System.out.println(a + " is a perfect number");
            } else {
                System.out.println(a + " is not a perfect number");
            }
        }
    }
