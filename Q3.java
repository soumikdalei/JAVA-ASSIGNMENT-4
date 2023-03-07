import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();int sum=0;int i=1;
        do {
            int r =  (int) (1+(n * Math.random()));
            System.out.print(r);
            System.out.print(" ");
            sum=sum+r;
            i++;
        }while(i<=n);
        sum=sum/n;
        System.out.println("\nThe average sum is "+sum);
    }
}
