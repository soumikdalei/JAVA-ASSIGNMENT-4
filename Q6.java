import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base : ");
        int base =sc.nextInt();
        System.out.println("Enter the power : ");
        int power=sc.nextInt();int sum=1;
        for(int i=1;i<=power;i++){
            sum=base*sum;
        }
        System.out.println(sum);

    }
}
