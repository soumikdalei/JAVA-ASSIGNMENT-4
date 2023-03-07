import java.util.Scanner;
public class hw5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a=" ";
        String b=" ";
        for(int i=1;i<=n;i++){
            b=b+i+b;
            System.out.println(b);
        }

    }
}
