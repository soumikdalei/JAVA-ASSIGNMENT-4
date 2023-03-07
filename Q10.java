import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int a=sc.nextInt();
        int r=0;
        for(int i=1;i<=a;i=i*3){
            r=i;
        }
        System.out.println(r);
    }
}
