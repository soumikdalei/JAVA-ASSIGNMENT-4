import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);int a,b;
        do{System.out.println("Enter a number ");
            a=sc.nextInt();
            System.out.println("Computer's choice");
            b=(int)(1+(10*Math.random()));
            System.out.println(b);
       if(a>b){
            System.out.println("Too high , try again");
        }
        else if(a<b){
            System.out.println("Too low, try again");
        }
        else{
            System.out.println("Same choice");
        }
       }while(b!=a);

    }
}
