import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        int e=b;int f=a;
        while(a%b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        System.out.println("GCD of "+f+" and "+e+" is "+b);


    }
}

