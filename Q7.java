import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the multiplication table of :");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d= %d\n",a,i,a*i);
        }

    }
}
