import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        int num=a;int sum=0;int j;
        while(a>=1){
            j=a%10;
            sum+=j;
            a=a/10;
        }
        if(sum%9==0)
            System.out.println(num+" is divisible by 9");
        else
            System.out.println(num+" is not divisible by 9");

    }
}
