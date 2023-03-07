import java.util.Scanner;
public class hw4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();int sum=0,sum1=1;
        for(int i=1;i<=n;i++){
            if (i%2==0){
                sum+=i;
            }
            else if (i%2!=0) {
                sum1*=i;

            }
        }
        System.out.println(sum);
        System.out.println(sum1);

    }
}
