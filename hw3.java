public class hw3 {
    public static void main(String[] args) {
        int a=0;
        for(int i=1000;i<=2000;i++){
            System.out.print(i+" ");
            a++;
            if(a==5){
                System.out.println();
                a=0;
            }
        }
    }
}
