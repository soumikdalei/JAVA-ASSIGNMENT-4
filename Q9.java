import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0;
        int a=0;
        while(n>0){
            if(n%10!=0){
                sum=sum+(n%10)*(int)Math.pow(10,a);
                a++;
                n=n/10;
            }
            if(n%10==0){
                n=n/10;}
        }
        System.out.println(sum);
    }
}
